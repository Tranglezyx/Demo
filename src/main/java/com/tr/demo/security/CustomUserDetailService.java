//package com.tr.demo.security;
//
//import com.tr.demo.dto.User;
//import com.tr.demo.dto.UserRole;
//import com.tr.demo.service.IUserRoleService;
//import com.tr.demo.service.IUserService;
//import org.apache.commons.collections4.CollectionUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
///**
// * @author trangle
// */
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//
//    @Autowired
//    private IUserService userService;
//
//    @Autowired
//    private IUserRoleService userRoleService;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws RuntimeException {
//        Collection<GrantedAuthority> authorities = new ArrayList<>();
//
//        User user = userService.selectOne(new User().setUserName(userName));
//
//        if (user == null) {
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//
//        List<UserRole> userRoleList = userRoleService.selectUserRole(user);
//        if (CollectionUtils.isNotEmpty(userRoleList)) {
//            userRoleList.forEach(userRole -> authorities.add(new SimpleGrantedAuthority(userRole.getRoleName())));
//        } else {
//            throw new RuntimeException("用户角色未找到");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
//    }
//}

package com.tr.demo.security;
public class CustomUserDetailService{

}
