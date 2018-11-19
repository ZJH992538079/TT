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

		<!-- start umeditor: 百度文本编辑器 -->
		<link href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/ueditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
		<!-- umeditor配置文件 -->
		<script type="text/javascript" charset="utf-8" src="//cdn.laeni.cn/umeditor/umeditor-project1.config.js"></script>
		<script type="text/javascript" charset="utf-8" src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/ueditor/umeditor.min.js"></script>
		<script type="text/javascript" src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/ueditor/lang/zh-cn/zh-cn.js"></script>
		<!-- end 百度文本编辑器 -->

		<title>帖子页面</title>
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
		
		<div style="padding-top: 15px;padding-bottom: 15px;">
			<div class="container">
				<div class="row">
					<div class="col col-lg-6">
						<button type="button" class="btn btn-primary btn-lg btn-block" onclick="window.location.href='myforum.html'">贴子中心</button>
					</div>
					<div class="col col-lg-6">
						<button type="button" class="btn btn-primary btn-lg btn-block" onclick="window.location.href='doforum.html'">发帖中心</button>
					</div>
				</div>
			</div>
		</div>

		<div class="container" style="padding-bottom: 15px;">
			<div class="row">
				<div class="col col-lg-12">
					<hr size="2" color="#86">
				</div>
			</div>
		</div>

		<div class="container" style="padding-bottom: 15px;">
			<div class="row">
				<div class="col col-lg-12">
					<form>
						<span class="d-none" id="forum_id"></span>
						<div class="form-group">
							<span>标题</span>
							<input type="text" class="form-control" id="form_title" >

						</div>
						<div class="form-group">
							<span>贴子内容</span>
							<style type="text/css">
								.forum_value {
									width: 100%;;
									height: auto
								}

							</style>
							<div class="forum_value">
								<script type="text/javascript" id="forum_value" class="forum_value">
									
								</script>
							</div>
							<!-- <textarea class="form-control" id="value"></textarea> -->
						</div>
					</form>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary" onclick="doUpdateForum()">发帖</button>
					</div>
				</div>
			</div>
		</div>

		<script type="text/javascript">
				/* 实例化贴子内容编辑器 */
				var $fv = UM.getEditor('forum_value'),
						/* 帖子id*/
						forumId = $("#forum_id").html();

				/* 获取用户id */
				var
					userInfo = USER.getUserinfo(),
					userId = userInfo && userInfo.user_id;

				/* 编辑操作，更新贴子内容 */
				function doUpdateForum() {
					
					console.log("info="+parseInt(10*Math.random())%3+1)
					$.ajax({
						/* 修改贴子 */
						url: "/insertForum",
						type: "post",
						dataType: "text",
						data: {
							title: $("#form_title").val(),
							value: UM.getEditor('forum_value').getContent(),
							userId:userId,
							typeId:parseInt(10*Math.random())%3+1
							
						},
						success: function(re) {
							console.log(re);
							if(re == "SUCCESS"){
								window.location.href='myforum.html';
							} else {
								alert("发帖失败");
							}
						}
					})
				}

				</script>
	</body>
</html>
