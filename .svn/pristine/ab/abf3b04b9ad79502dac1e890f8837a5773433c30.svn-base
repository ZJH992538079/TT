package cn.laeni.project1.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

//@Controller
public class MyRealm extends AuthorizingRealm {
	//注入用户数据层接口
	@Autowired
//	MdFive mdFive;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
			/*//获取登陆用户名和密码的token对象
			UsernamePasswordToken t=(UsernamePasswordToken) token;
			//获取用户名
			String userName=(String)t.getPrincipal();
			//查询数据库，获取用户对象
			User user=userMapper.getUserByUserName(userName);

			AuthenticationInfo info=null;
			//判断用户是否存在
			if(user!=null) {
				//创建用户凭证
				info=new SimpleAuthenticationInfo(user.getUserName(), user.getPassWord(), this.getName());
			}
			return info;*/
		return null;
	}

}