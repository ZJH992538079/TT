﻿<!--用于注册帐号-->
<!-- 未完成的地方标注"TODO" -->
<!DOCTYPE html>
<html lang="zh-CN" class="w">

	<head>
		<!-- 下面3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="renderer" content="webkit">
		<meta name="spm-id" content="a21bo">
		<meta name="aplus-xplug" content="NONE">
		<!-- user-scalable=yes设置网页可以自由缩放(推荐,默认为yes) -->
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=2, user-scalable=yes">
		<!-- 是否显示默认的苹果工具栏和菜单栏(默认是yes) -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<!-- 控制状态栏显示样式 -->
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
		<!-- <script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/js/jquery-3.3.1.min.js" type="text/javascript"
	 charset="utf-8"></script> -->
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
		<!-- <script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/bootstrap-4.0.0-dist/js/bootstrap.min.js"
	 type="text/javascript" charset="utf-8"></script> -->
		<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
		<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
		<!--[if lt IE 9]>
					<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
					<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
				<![endif]-->

		<!-- start SUI -->
		<link href="http://g.alicdn.com/sj/dpl/1.5.1/css/sui.min.css" rel="stylesheet">
		<script type="text/javascript" src="http://g.alicdn.com/sj/lib/jquery/dist/jquery.min.js"></script>
		<script type="text/javascript" src="http://g.alicdn.com/sj/dpl/1.5.1/js/sui.min.js"></script>
		<!-- end SUI -->

		<!-- IconFont -->
		<script src="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/iconfont/iconfont.js"></script>
		<link rel="stylesheet" type="text/css" href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/iconfont/iconfont.css" />

		<!-- 自定义JavaScript工具: utlis.js -->
		<script src="//cdn.laeni.cn/public/js/utlis.js" type="text/javascript" charset="utf-8"></script>

		<!-- 重置一些浏览器默认样式: reset.css -->
		<link rel="stylesheet" type="text/css" href="https://chengdu-1252266447.cos.ap-chengdu.myqcloud.com/cdn.laeni.cn/public/css/reset.css" />

		<!-- 前端配置文件 -->
		<script src="//cdn.laeni.cn/public/config/laeni.cn.config.js" type="text/javascript" charset="utf-8"></script>

		<!-- 如需使用登录功能,则引入该js文件即可: user.js -->
		<script src="//cdn.laeni.cn/public/js/user.js" type="text/javascript" charset="utf-8"></script>
		<title>文件空间</title>

		<script src="index.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="index.css" />
	</head>

	<body>

		<!-- 导航栏: TODO 测试阶段,公用部分自动引入 -->
		<script type="text/javascript" id="header_script">
			$(function() {
				$.ajax({
					url: (typeof LAENI_CONFIG != "undefined" && LAENI_CONFIG.URL.CDN + "/html/header_0.html") ||
						"//cdn.laeni.cn/html/header_0.html",
					xhrFields: {
						thCredentials: true
					},
					success: function(re) {
						$("#header_script").before(re).remove();
					}
				});
			});
		</script>

		<!-- 打开页面是首先进行登录 -->
		<!-- <script type="text/javascript">
			(function() {
				var _user = typeof USER != "undefined" ? USER : null;

				if (!_user.islogin()) {
					_user.login();
				}
			})();
		</script> -->

		<div id="mybody" class="sui-layout">
			<!-- 侧边栏 -->
			<div id="sidebar_left" class="sidebar">
				<div id="sidebar">
					<div id="space_title">空间使用情况</div>
					<div class="sui-progress progress-xlarge">
						<div style="width: 60%;" class="bar"></div>
						<div class="bar-text">60%</div>
					</div>
					<div id="space_num">12G/60G</div>

					<!-- 清除浮动 -->
					<div class="clear"></div>
					<div id="nav">
						<ul class="sui-nav nav-list">
							<li><a>全部文件</a></li>
							<li class="active"><a>图片</a></li>
							<li><a>文档</a></li>
							<li><a>视频</a></li>
							<li><a>音乐</a></li>
							<li><a>其他</a></li>
						</ul>
					</div>
				</div>
			</div>

			<!-- 右边部分 -->
			<div id="content_right" class="content">
				<!-- 自定义页内导航栏 -->
				<div id="content-nav-1" class="sui-layout">
					<!-- 功能按钮组 -->
					<div id="content-nav" class="content">
						<button class="btn btn-primary" type="button"><svg class="icon" aria-hidden="true" style="margin-right: 5px;">
								<use xlink:href="#icon-shangchuan"></use>
							</svg>上传</button>
						<button class="btn btn-outline-primary" type="button"><svg class="icon" aria-hidden="true" style="margin-right: 5px;">
								<use xlink:href="#icon-newwenjianjia"></use>
							</svg>新建文件夹</button>
						<div id="show-type" class="dropdown">
							<button class="btn btn-outline-primary dropdown-toggle" type="button"
							 aria-haspopup="true" aria-expanded="false">
								<svg class="icon" aria-hidden="true">
									<use xlink:href="#icon-xiangxi"></use>
								</svg>
								大图标
							</button>
							<div class="dropdown-menu">
								<a class="dropdown-item">大图标</a>
								<a class="dropdown-item">小图标</a>
								<a class="dropdown-item">详细信息</a>
							</div>
						</div>
					</div>
					<!-- 文件搜索框 -->
					<div id="sidebar-nav" class="sidebar">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="搜索文件" aria-label="文件搜索框"
							 aria-describedby="basic-addon2">
							<div class="input-group-append">
								<span class="input-group-text" id="basic-addon2">搜索</span>
							</div>
						</div>
					</div>
				</div>
				<!-- 目录结构展示 -->
				<div id="path">
					<div>
						<button class="btn btn-link">返回上一级</button>
					</div>
					<div class="btn-group">
						<button type="button" class="btn btn-link btn-secondary">根目录/</button>
						<button type="button" class="btn btn-link btn-secondary">新建文件夹/</button>
					</div>
				</div>
				
				<!-- 具体网盘的内容 -->
				<div id="pan_value">
					
					<div class="file">
						<!-- 文件图标和文件名 -->
						<div class="file-val">
							<div class="file-ico"><svg class="icon" aria-hidden="true"><use xlink:href="#icon-icon_folder"></use></svg></div>
							<div class="file-title">新建文件夹</div>
						</div>
						<!-- 操作菜单 -->
						<div class="file-val file-menu">
							<!-- 操作菜单列表 -->
							<div class="file-val file-menu-list none">
								<div id="nav">
									<ul class="sui-nav nav-list">
										<li><a>重命名</a></li>
										<li><a>删除</a></li>
										<li><a>移动</a></li>
										<li><a>复制</a></li>
										<li><a>分享</a></li>
										<li><a>复制链接</a></li>
									</ul>
								</div>
							</div>
							<span></span>
							<span></span>
						</div>
					</div>
					
					<div class="file">
						<!-- 文件图标和文件名 -->
						<div class="file-val">
							<div class="file-ico"><svg class="icon" aria-hidden="true"><use xlink:href="#icon-word"></use></svg></div>
							<div class="file-title">新建文件夹</div>
						</div>
						<!-- 操作菜单 -->
						<div class="file-val file-menu">
							<!-- 操作菜单列表 -->
							<div class="file-val file-menu-list none">
								<div id="nav">
									<ul class="sui-nav nav-list">
										<li><a>重命名</a></li>
										<li><a>删除</a></li>
										<li><a>移动</a></li>
										<li><a>复制</a></li>
										<li><a>分享</a></li>
										<li><a>复制链接</a></li>
									</ul>
								</div>
							</div>
							<span></span>
							<span></span>
						</div>
					</div>
					
					<div class="file">
						<!-- 文件图标和文件名 -->
						<div class="file-val">
							<div class="file-ico"><svg class="icon" aria-hidden="true"><use xlink:href="#icon-ppt"></use></svg></div>
							<div class="file-title">新建文件夹</div>
						</div>
						<!-- 操作菜单 -->
						<div class="file-val file-menu">
							<!-- 操作菜单列表 -->
							<div class="file-val file-menu-list none">
								<div id="nav">
									<ul class="sui-nav nav-list">
										<li><a>重命名</a></li>
										<li><a>删除</a></li>
										<li><a>移动</a></li>
										<li><a>复制</a></li>
										<li><a>分享</a></li>
										<li><a>复制链接</a></li>
									</ul>
								</div>
							</div>
							<span></span>
							<span></span>
						</div>
					</div>
					
					<div class="file">
						<!-- 文件图标和文件名 -->
						<div class="file-val">
							<div class="file-ico"><svg class="icon" aria-hidden="true"><use xlink:href="#icon-New_img"></use></svg></div>
							<div class="file-title">新建文件夹</div>
						</div>
						<!-- 操作菜单 -->
						<div class="file-val file-menu">
							<!-- 操作菜单列表 -->
							<div class="file-val file-menu-list none">
								<div id="nav">
									<ul class="sui-nav nav-list">
										<li><a>重命名</a></li>
										<li><a>删除</a></li>
										<li><a>移动</a></li>
										<li><a>复制</a></li>
										<li><a>分享</a></li>
										<li><a>复制链接</a></li>
									</ul>
								</div>
							</div>
							<span></span>
							<span></span>
						</div>
					</div>
					
					<div class="file">
						<!-- 文件图标和文件名 -->
						<div class="file-val">
							<div class="file-ico"><svg class="icon" aria-hidden="true"><use xlink:href="#icon-wenjian"></use></svg></div>
							<div class="file-title">新建文件夹</div>
						</div>
						<!-- 操作菜单 -->
						<div class="file-val file-menu">
							<!-- 操作菜单列表 -->
							<div class="file-val file-menu-list none">
								<div id="nav">
									<ul class="sui-nav nav-list">
										<li><a>重命名</a></li>
										<li><a>删除</a></li>
										<li><a>移动</a></li>
										<li><a>复制</a></li>
										<li><a>分享</a></li>
										<li><a>复制链接</a></li>
									</ul>
								</div>
							</div>
							<span></span>
							<span></span>
						</div>
					</div>
					
				</div>
			</div>
		</div>

	</body>

</html>
