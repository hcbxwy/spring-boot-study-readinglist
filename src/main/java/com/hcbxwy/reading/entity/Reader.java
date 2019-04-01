/*
 * <ul>
 * <li>项目名称：study</li>
 * <li>文件名称：Reader.java</li>
 * <li>日期：2019/3/30 11:58</li>
 * <li>Copyright ©2016-2019 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.reading.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 读者实体对象
 *
 * @author Billson
 * @since 2019/3/30 11:58
 */
@Entity
@Data
public class Reader implements UserDetails {

    @Id
    private String username;
    private String fullname;
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 授予角色：READER
        return Collections.singletonList(new SimpleGrantedAuthority("READER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        // 账号永不过期
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // 账号永不冻结
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // 证书永不过期
        return true;
    }

    @Override
    public boolean isEnabled() {
        // 永不禁用
        return true;
    }
}
