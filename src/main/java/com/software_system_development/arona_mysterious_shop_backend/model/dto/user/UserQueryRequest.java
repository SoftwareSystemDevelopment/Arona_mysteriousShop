package com.software_system_development.arona_mysterious_shop_backend.model.dto.user;

import com.software_system_development.arona_mysterious_shop_backend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户查询请求
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequest extends PageRequest implements Serializable {

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户角色：user/provider/admin/ban
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}