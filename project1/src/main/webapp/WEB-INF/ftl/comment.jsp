<!DOCTYPE html>
<html lang="zh-CN" class="w">

<head>
	<!-- 下面3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=2">

	<meta name="renderer" content="webkit">
	<meta name="spm-id" content="a21bo">
	<meta name="aplus-xplug" content="NONE">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<!-- 关闭自动将连串数字识别为电话号码 -->
	<meta name="format-detection" content="telephone=no">
	<!-- 声明此网页同时适用于PC和移动端(一般使用了CSS3的媒体查询,能根据各种屏幕尺寸自适应的网站) -->
	<meta name="applicable-device" content="pc,mobile">
	<!-- <meta name="keywords" content="以逗号分隔的关键字"> -->
	<!-- <meta name="description" content="这里是页面描述"> -->
	<base target="_blank">

	<!-- Bootstrap -->
	<link href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/bootstrap-4.0.0-dist/css/bootstrap.css"
		  rel="stylesheet" type="text/css" />
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/js/jquery-3.3.1.min.js" type="text/javascript"
			charset="utf-8"></script>
	<!-- Bootstrap下拉插件 -->
	<script src="//cdn.laeni.cn/public/bootstrap-4.0.0-dist/js/popper.min.js"
			type="text/javascript" charset="utf-8"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/bootstrap-4.0.0-dist/js/bootstrap.min.js"
			type="text/javascript" charset="utf-8"></script>
	<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
	<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
	<!--[if lt IE 9]>
	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->

	<!-- IconFont -->
	<script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/iconfont/iconfont.js"></script>
	<link rel="stylesheet" type="text/css" href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/iconfont/iconfont.css" />

	<!-- 自定义JavaScript工具: utlis.js -->
	<script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/js/utlis.js" type="text/javascript"
			charset="utf-8"></script>

	<!-- 重置一些浏览器默认样式: reset.css -->
	<link rel="stylesheet" type="text/css" href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/css/reset.css" />

	<!-- 前端配置文件 -->
	<script src="//cdn.laeni.cn/public/config/laeni.cn.config.js" type="text/javascript" charset="utf-8"></script>

	<!-- 如需使用登录功能,则引入该js文件即可: user.js -->
	<script src="//cdn.laeni.cn/public/js/user.js" type="text/javascript"
			charset="utf-8"></script>

	<title><#if ONEFORUM ??>${ONEFORUM.title!""}</#if></title>
</head>
<body>
<!-- 通知栏 -->
<!-- <div>通知通知通知通知通知通知通知通知</div> -->

<!-- 导航栏: TODO 测试阶段,公用部分自动引入 -->
<script type="text/javascript" id="header_script">
	$(function() {
		$.ajax({
			url: (typeof LAENI_CONFIG != "undefined" && LAENI_CONFIG.URL.CDN + "/html/header_1.html") || "//cdn.laeni.cn/html/header_1.html",
			xhrFields: {
				thCredentials: true
			},
			success: function(re) {
				$("#header_script").before(re).remove();
			}
		});
	});
</script>
<#if ONEFORUM ??>
	<!-- 帖子 -->
	<div class="container" style="margin-top: 20px">
		<input type="hidden" id="forum_id" value="${ONEFORUM.id}">
		<!-- 左对齐 -->
		<div class="media">
			<div class="media-left" style="width: 100px;word-wrap:break-word;">
				<img src="http://static.runoob.com/images/mix/img_avatar.png" class="media-object" style="width:60px">
				<!-- 昵称 -->
				<h2>亲爱的吧主</h2>
			</div>
			<div class="media-body" style="font-size: 20px;">
				<!-- 标题 -->
				<h4 id="forum_title" class="media-heading" style="margin: 30px 0;margin-left:20px;font-size: 33px">${ONEFORUM.title!""}</h4>
				<div style="" style="margin-left:10px;">
					${ONEFORUM.value!""}
				</div>

			</div>
		</div>
		
	</div>
		
		<div class="clear">
			<div class="row" style="width: 90%;margin: 0 auto; margin-top: 20px">
				<div class="input-group col-11">
					<textarea id="comment_value" style="width: inherit;height: 120px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</textarea>
				</div>
				<div class="align-self-end"style="border-radius:25px"><button onclick="insertcomment()" class="btn btn-primary" type="button;">提交</button></div>
			</div>
		</div>

		<!-- 评论区 -->
		<div id="pinglun">
			
		</div>
		
		<!-- 页脚 -->
		<div align="center" style="margin-top: 30px;margin-bottom: 20px">
			<font size="2";color="black">
			<a>地址：科华北路57号</a>
			&nbsp;&nbsp;&nbsp;
			<a href="cdm10170610@163">联系我们</a>
			</font>
		</div>
		
</#if>


	</body>

		<script type="text/javascript">
			var $userinfo = USER && USER.getUserinfo(),
			$userId = $userinfo && $userinfo.user_id,
			$nickname = $userinfo && $userinfo.nickname,
			$forumId = $("#forum_id").val();

			$(function() {
				loadcomment();//初始化界面之后立即显示帖子列表
			});
			
			//提交评论
			function insertcomment() {
				$.ajax({
					/* 查询个人的贴子 */
					url: "insertComment.do",
					type: "POST",
					dataType: "text",
					data: {
						forumId:$forumId,
						userId:$userId,
						commentValue:$("#comment_value").val()
					},
					success: function(data) {
						if(data=="SUCCESS"){
							alert("评论成功");
							/* 刷新评论区 */
							loadcomment();
						}else{
							alert("评论提交失败");
							
						}
					},
					error: function(data) {
						console.log(data)
					}
				})
			}
			
			/* 获取评论 */
			function loadcomment() {
				$.ajax({
					/* 查询个人的贴子 */
					url: "selectComment.do",
					type: "GET",
					dataType: "JSON",
					data: {
						id: $forumId,
					},
					success: function(data) {
						/* var m="";
						for(i=0;i<data.length;i++){
							m+="<div class='media' style='margin-top: 30px;'><div class='media-left'><img src='https://avatar.csdn.net/0/4/5/3_qq_41124690.jpg' class='media-object' style='width:60px'></div><div class='media-body'><h4 class='media-heading'>"+data[i].commentId+"</h4></div><p id='comment_value'>"+data[i].commentValue+"</p></div>"
						} */
						
						
						for(var i=0,l=data.length;i<l;i++) {
							var pl = '<div class="media" style="margin: 10px 75px;"><input type="hidden" id="commentId" name="commentId" value="'+data[i].commentId+'"><input type="hidden" id="userId" name="userId" value="'+data[i].userId+'"><img class="mr-3" style="width: 56px;border-radius: 50%;" src="http://static.runoob.com/images/mix/img_avatar.png" alt="Generic placeholder image"><div class="media-body">'+data[i].commentValue+'</div></div>';
							
							$("#pinglun").append(pl);
						}
				
					}
					
				});
			}
		</script>
		

</html>
