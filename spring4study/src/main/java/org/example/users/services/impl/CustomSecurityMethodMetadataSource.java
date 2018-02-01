package org.example.users.services.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.method.MapBasedMethodSecurityMetadataSource;


public class CustomSecurityMethodMetadataSource extends MapBasedMethodSecurityMetadataSource {

    protected final Log logger = LogFactory.getLog(getClass());

//	private ICommonDAO commonDAO;
    private String rolePrefix = "perm_";
    
    public void afterPropertiesSet() throws java.lang.Exception{
//		String hql = "from " + BResourcePermission.class.getSimpleName() ; 
//		@SuppressWarnings("unchecked")
//		List<BResourcePermission> rs = (List<BResourcePermission>) commonDAO.find(hql);
//		if(null == rs)
//			return;
//		
//		for(BResourcePermission perm: rs){
//			if(perm.getRType() == 10){	//==10 表示url形式的资源权限,而不是业务层的(service层)
//				SecurityConfig configAttribute = new SecurityConfig(rolePrefix+perm.getSeqId());
//				Collection<ConfigAttribute> c = new HashSet<ConfigAttribute>();
//				c.add(configAttribute);
//				AntPathRequestMatcher requestMatcher = new AntPathRequestMatcher(perm.getResources());
//				requestMap.put(requestMatcher, c);
//			}
//
//		}
    }
    
 
    
}
