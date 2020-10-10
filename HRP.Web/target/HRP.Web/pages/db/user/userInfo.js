var isEdit = false;
var person = {};

//页面初始化
$(document).ready(function () {
    initToolBar();
    initData();
});

//初始化工具栏
function initToolBar() {
    $("#tb").toolbar({
        items: [{
            id: "save",
            text: "保存",
            iconCls: "icon-save",
            handler: function () {
                saveSetting();
            }
        },{
            id: "exit",
            text: "取消",
            iconCls: "icon-exit",
            handler: function () {
                closeDialog(false);
            }
        }]
    });
}

function initData() {

    var teacherNumber = getURLParameter("teacherNumber");
    if (teacherNumber) {
        loadData(decodeURI(teacherNumber));
    }
    Refer.Department({
        inputObj: $("#positionNumber"),
        selectEnd:false,
        referCallBack: function (returnVal,inputObj) {
            if (returnVal) {
                $(inputObj).val(returnVal.deptCode);
                $("#teachPositionType").val(returnVal.deptName);
            }
        }
    })
}
function loadData(personCode) {
    ajaxSubmit({
        url: contextPath + "/db/user/getInfo.do",
        data: { personCode: personCode },
        success: function (result) {
            if (result.isOk == "Y") {
                person = result.data.person;
                $("#infoForm").fill(person);
                $("#teacherNumber").css("color", "gray").attr("readonly", true);
                isEdit = true;
            }
        }
    });
}
function saveSetting() {
    var params = $("#infoForm").form2json();
    if (isEdit) {
        params.isUpdate = true;
    }
    else {
        params.isNew = true;
    }
    person = $.extend(person, params);
    ajaxSubmit({
        url: contextPath + "/db/user/save.do",
        data: {
            person: JSON.stringify(params)
        },
        formId: "infoForm",
        beforeSend: function () {
            return validateForm("infoForm");
        },
        success: function (data) {
            if (data.isOk == "Y") {
                alertSuccess(data.message);
                closeDialog(true);
            } 
        }
    });
}