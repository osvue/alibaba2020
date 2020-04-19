package com.qiangzi.springcloud.commons.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@Data
@TableName(value = "oauth_client_details")
public class OauthClientDetails implements Serializable {

  @TableId(value = "client_id", type = IdType.INPUT)
  private String clientId;

  @TableField(value = "resource_ids")
  private String resourceIds;

  @TableField(value = "client_secret")
  private String clientSecret;

  @TableField(value = "scope")
  private String scope;

  @TableField(value = "authorized_grant_types")
  private String authorizedGrantTypes;

  @TableField(value = "web_server_redirect_uri")
  private String webServerRedirectUri;

  @TableField(value = "authorities")
  private String authorities;

  @TableField(value = "access_token_validity")
  private Integer accessTokenValidity;

  @TableField(value = "refresh_token_validity")
  private Integer refreshTokenValidity;

  @TableField(value = "additional_information")
  private String additionalInformation;

  @TableField(value = "autoapprove")
  private String autoapprove;

  private static final long serialVersionUID = 1L;

  public static final String COL_CLIENT_ID = "client_id";

  public static final String COL_RESOURCE_IDS = "resource_ids";

  public static final String COL_CLIENT_SECRET = "client_secret";

  public static final String COL_SCOPE = "scope";

  public static final String COL_AUTHORIZED_GRANT_TYPES = "authorized_grant_types";

  public static final String COL_WEB_SERVER_REDIRECT_URI = "web_server_redirect_uri";

  public static final String COL_AUTHORITIES = "authorities";

  public static final String COL_ACCESS_TOKEN_VALIDITY = "access_token_validity";

  public static final String COL_REFRESH_TOKEN_VALIDITY = "refresh_token_validity";

  public static final String COL_ADDITIONAL_INFORMATION = "additional_information";

  public static final String COL_AUTOAPPROVE = "autoapprove";
}
