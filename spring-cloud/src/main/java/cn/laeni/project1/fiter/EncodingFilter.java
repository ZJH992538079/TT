package cn.laeni.project1.fiter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class EncodingFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
		// 设置相应编码格式
//		req.setCharacterEncoding("utf8");
//		resp.setCharacterEncoding("utf8");
//		resp.setContentType("text/html;charset=utf-8");
//		resp.setContentType("application/json;charset=utf-8");

		// 设置跨域请求
		crossDomain((HttpServletRequest) req,(HttpServletResponse) resp);

		chain.doFilter(req, resp);
	}

	public void init(FilterConfig config) throws ServletException {

	}

	/**
	 * 跨域访问
	 * @param request
	 * @param response
	 */
	private static void crossDomain(HttpServletRequest request, HttpServletResponse response) {
		String address = request.getHeader("referer"); // 获取页面的请求地址
		if (address != null) {
			try {
				URL url = new URL(address);
				// url.getProtocol()获取URL请求请求协议
				// url.getAuthority()能获取包含端口部分
				StringBuilder ss = new StringBuilder(url.getProtocol()).append("://").append(url.getAuthority());
				response.setHeader("Access-Control-Allow-Origin", ss.toString());
				response.setHeader("Access-Control-Allow-Credentials", "true");
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

}
