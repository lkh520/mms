var dataTable = null;
jQuery(document).ready(function() {

	dataTable = jQuery("#dataTable").raytable({
    	datasource: { data: [], keyfield: 'id' },
    	columns: [
            //{ title: "Info", icons: [{ glyph: "glyphicon-info-sign", handler: iconAction, data:"id" }], renderIf: isManager },
    		 {title:"",field:"userId", renderIf: isManager }
            ,{ field: "orgId", title: "区域"}
            ,{ field: "loginName", title: "登陆名" }
            ,{ field: "vsername", title: "显示名"}
            ,{ field: "password", title: "密码"  }
            ,{ field: "phone", title: "电话"  }
            ,{ field: "email", title: "邮箱"  }
            ,{ field: "createTime", title: "创建时间",  format: parseDate }
            ,{ field: "loginTime", title: "登陆时间",  format: parseDate }
            ,{ field: "lastLoginTime", title: "最后登陆时间",  format: parseDate }
            ,{ field: "loginCount", title: "登陆次数"  }
        ],
    	pagesize: 10,
    	maxPageButtons: 2,
    	rowNumbers: true,
    	rowClickHandler: rowAction
	});

    jQuery(".glyphicon").css('cursor', 'pointer');
    
    // load some default
    doLoad(1, 10);

});

// load some data
function doLoad(pageNum, pageSize) {
	var data = $("#searchData").serializeJson();
	debugger
	$.ajax({
	    type: "POST",
	    url: "/mms/user/all/"+pageNum+"/"+pageSize,
	    contentType: "application/json;charset=utf-8",  
	    data: JSON.stringify(data),// 要提交的表单
	    success: function (msg) {
			if (msg) {
				dataTable.data(msg, 'id');
			} 
	    }
	  });
}

// icon clicked event handler
function iconAction(event) {
	// jquery to get the record ID back out
	var data = jQuery(event.target).data('ray-data');
	alert('glyph icon data is ' + data);
	// alert('You clicked the icon with data = ' + event.data.id + ' on row ' +
	// event.data.rowIdx );
}

// row clicked handler
function rowAction(event) {
	// jquery to get the record ID back out
	// var id = jQuery(event.target).data('ray-key');
	//alert('You clicked row ' + event.data.rowIdx + ' with object ID '+ event.data.id);
}

// boolean handler to determine if the cell content is rendered
function isManager(item) {
	return (item.grade > 4);
}

// custom format handler
function parseDate(item) {
	// source is ISO 8601
	var d = new Date(item.birthDate);
	return d.toDateString();
}
