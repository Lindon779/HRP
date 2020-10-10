<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>项目分类参照</title>
	<%@include file="/pages/common/include/include.jsp" %>
	<script type="text/javascript" src="<%=currentPath %>/itemSortRefer.js?t=<%=version %>"></script>
</head>
<body class="easyui-layout">     
    <div data-options="region:'north',split:false,border:false" style="height:31px;">
        <div id="tb"></div>
    </div>

    <div data-options="region:'center',iconCls:'icon-ok',border:false" style="padding:0px">
        <ul  id="zTree" class="ztree"></ul>
    </div>
</body>
</html>