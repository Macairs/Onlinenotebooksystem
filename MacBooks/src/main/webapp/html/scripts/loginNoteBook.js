function loginBookTitle(){
	var coookets = localStorage.getItem("UserMsg");
	$.ajax({
			 url: 'http://localhost:8080/MacBooks/notelogn',
             type: 'post' ,
             data:{'UserId':coookets},
             success: function(datas){
            	 
            	 var lengths = datas.data.length;
            	 for(var i = 0 ; i<lengths ; i++){
            		 //笔记本Id
            		 var notebookid = datas.data[i].cnNotebookId;
            		 //笔记本标题
            		 var CnNoteBookTitle = datas.data[i].cnNotebookName;
            		 //设置liJavaScript对象
            		  var lis = "<li class='online'>"+"<a>"+"<i title='online' rel='tooltip-bottom'>"+"<i class='fa fa-book' title='online' rel='tooltip-bottom'>"+"</i>"+CnNoteBookTitle+"</a>"+"</li>";
            		 //动态生成li标签
            		  $("#loginNote").append(lis);
            		 //动态绑定notebookid
            		 $("#loginNote a").last().attr("bookids",notebookid);//给a标签赋值然后在前端取值
            	 }
             }  
	});
}
//<div class="note_menu" tabindex='-1'>
//<dl>
//	<dt><button type="button" class="btn btn-default btn-xs btn_move" title='移动至...'><i class="fa fa-random"></i></button></dt>
//	<dt><button type="button" class="btn btn-default btn-xs btn_share" title='分享'><i class="fa fa-sitemap"></i></button></dt>
//	<dt><button type="button" class="btn btn-default btn-xs btn_delete" title='删除'><i class="fa fa-times"></i></button></dt>
//</dl>
//</div>

function loginNoteTitle(){
	 $("#loginNote").on("click","a",function(){
		 //点击先删除li之前生成的记录，执行后又生成li
		 $("#contactslist").empty();
		 //渲染a标签前先取消之前的设置（这里设置统一删除）
		 $("#loginNote a").removeClass("checked");
		 //点击后渲染一下a标签
		 $(this).addClass("checked");
		 //NoteMsg
		//获取绑定的NoteBookId值
	  	var NotebookId = $(this).attr("bookids");
	  	$.ajax({
	  			url:'http://localhost:8080/MacBooks/NoteMsg',
	  			type:'post',
	  			data:{'notebookid':NotebookId},//为避免不必要的麻烦键的名字要与controller的一致
	  			success: function(datas){
	  				var leng = datas.data.length;
	  				for(var i = 0 ; i<leng ;i++ ){
	  					var notename =  datas.data[i].cnNoteTitle;
	  					var noteid = datas.data[i].cnNoteId;
	  					//创建 li以及绑值
	  					createli(notename,noteid);
	  				}
	  			}
	  	})
	}); 
	
}


function createli(notename,noteid){
	 	  var li="";
			  li+='<li class="online">'
			  li+='<a>'
			  li+='<i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i>'+notename+'<button type="button" class="btn btn-default btn-xs btn_position btn_slide_down"><i class="fa fa-chevron-down"></i></button>'	
			  li+='</a>'
			  li+='<div class="note_menu" tabindex="-1" id="notemenu">'
			  li+='<dl>'	
			  li+='<dt><button type="button" class="btn btn-default btn-xs btn_move" title="移动至..."><i class="fa fa-random"></i></button></dt>'		
			  li+='<dt><button type="button" class="btn btn-default btn-xs btn_share" title="分享"><i class="fa fa-sitemap"></i></button></dt>'		
			  li+='<dt><button type="button" class="btn btn-default btn-xs btn_delete" title="删除"><i class="fa fa-times"></i></button></dt>'		
			  li+='</dl>'	
			  li+='</div>'
			  li+='</li>'
			  var $lis = $(li);
			  $("#contactslist").append($lis);
			  //绑定noteid值
			  $("#contactslist a").last().attr("lidata",noteid);
}