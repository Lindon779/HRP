<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>未命名</title>
	<%@include file="/pages/common/include/include.jsp" %>
	<script type="text/javascript" src="<%=currentPath %>/accountStatusInfo.js?t=<%=version %>"></script>
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',split:false,border:false" style="height:31px;">
        <div id="tb"></div>
    </div>

    <div data-options="region:'center',iconCls:'icon-ok',split:true,border:true" style="padding:0px;border-width:0px 0px 0px 1px">
       	 <table id="dataGrid"></table>
    </div>
   
</body>
</html>
