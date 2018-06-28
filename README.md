# github-api-v3-demo

访问 `https://developer.github.com/v3/`

得到数据:

```json
{
  "current_user_url": "https://api.github.com/user",
  "current_user_authorizations_html_url": "https://github.com/settings/connections/applications{/client_id}",
  "authorizations_url": "https://api.github.com/authorizations",
  "code_search_url": "https://api.github.com/search/code?q={query}{&page,per_page,sort,order}",
  "commit_search_url": "https://api.github.com/search/commits?q={query}{&page,per_page,sort,order}",
  "emails_url": "https://api.github.com/user/emails",
  "emojis_url": "https://api.github.com/emojis",
  "events_url": "https://api.github.com/events",
  "feeds_url": "https://api.github.com/feeds",
  "followers_url": "https://api.github.com/user/followers",
  "following_url": "https://api.github.com/user/following{/target}",
  "gists_url": "https://api.github.com/gists{/gist_id}",
  "hub_url": "https://api.github.com/hub",
  "issue_search_url": "https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}",
  "issues_url": "https://api.github.com/issues",
  "keys_url": "https://api.github.com/user/keys",
  "notifications_url": "https://api.github.com/notifications",
  "organization_repositories_url": "https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}",
  "organization_url": "https://api.github.com/orgs/{org}",
  "public_gists_url": "https://api.github.com/gists/public",
  "rate_limit_url": "https://api.github.com/rate_limit",
  "repository_url": "https://api.github.com/repos/{owner}/{repo}",
  "repository_search_url": "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}",
  "current_user_repositories_url": "https://api.github.com/user/repos{?type,page,per_page,sort}",
  "starred_url": "https://api.github.com/user/starred{/owner}{/repo}",
  "starred_gists_url": "https://api.github.com/gists/starred",
  "team_url": "https://api.github.com/teams",
  "user_url": "https://api.github.com/users/{user}",
  "user_organizations_url": "https://api.github.com/user/orgs",
  "user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",
  "user_search_url": "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"
}
```

## https://api.github.com/user

### 直接访问

```json
{
	"message": "Requires authentication",
	"documentation_url": "https://developer.github.com/v3/users/#get-the-authenticated-user"
}
```


### https://developer.github.com/v3/users/#get-the-authenticated-user

回复公开和私人的个人资料信息
列出通过基本身份验证或具有用户范围的OAuth进行身份验证时的公用和私有配置文件信息。

回复公开个人资料信息
列出在通过OAuth进行身份验证而不包含用户范围时公开的个人信息。

https://api.github.com/users/maskleo/orgs

```json
[
  {
    "login": "Radical-Acmen",
    "id": 33554698,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjMzNTU0Njk4",
    "url": "https://api.github.com/orgs/Radical-Acmen",
    "repos_url": "https://api.github.com/orgs/Radical-Acmen/repos",
    "events_url": "https://api.github.com/orgs/Radical-Acmen/events",
    "hooks_url": "https://api.github.com/orgs/Radical-Acmen/hooks",
    "issues_url": "https://api.github.com/orgs/Radical-Acmen/issues",
    "members_url": "https://api.github.com/orgs/Radical-Acmen/members{/member}",
    "public_members_url": "https://api.github.com/orgs/Radical-Acmen/public_members{/member}",
    "avatar_url": "https://avatars3.githubusercontent.com/u/33554698?v=4",
    "description": "java技术交流群"
  },
  {
    "login": "m-fork",
    "id": 37094688,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3MDk0Njg4",
    "url": "https://api.github.com/orgs/m-fork",
    "repos_url": "https://api.github.com/orgs/m-fork/repos",
    "events_url": "https://api.github.com/orgs/m-fork/events",
    "hooks_url": "https://api.github.com/orgs/m-fork/hooks",
    "issues_url": "https://api.github.com/orgs/m-fork/issues",
    "members_url": "https://api.github.com/orgs/m-fork/members{/member}",
    "public_members_url": "https://api.github.com/orgs/m-fork/public_members{/member}",
    "avatar_url": "https://avatars0.githubusercontent.com/u/37094688?v=4",
    "description": "持续关注的一些项目"
  },
  {
    "login": "my-learn",
    "id": 37172727,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3MTcyNzI3",
    "url": "https://api.github.com/orgs/my-learn",
    "repos_url": "https://api.github.com/orgs/my-learn/repos",
    "events_url": "https://api.github.com/orgs/my-learn/events",
    "hooks_url": "https://api.github.com/orgs/my-learn/hooks",
    "issues_url": "https://api.github.com/orgs/my-learn/issues",
    "members_url": "https://api.github.com/orgs/my-learn/members{/member}",
    "public_members_url": "https://api.github.com/orgs/my-learn/public_members{/member}",
    "avatar_url": "https://avatars0.githubusercontent.com/u/37172727?v=4",
    "description": "存储一些学习的项目 Store some learning projects."
  },
  {
    "login": "fk-code",
    "id": 37429838,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3NDI5ODM4",
    "url": "https://api.github.com/orgs/fk-code",
    "repos_url": "https://api.github.com/orgs/fk-code/repos",
    "events_url": "https://api.github.com/orgs/fk-code/events",
    "hooks_url": "https://api.github.com/orgs/fk-code/hooks",
    "issues_url": "https://api.github.com/orgs/fk-code/issues",
    "members_url": "https://api.github.com/orgs/fk-code/members{/member}",
    "public_members_url": "https://api.github.com/orgs/fk-code/public_members{/member}",
    "avatar_url": "https://avatars0.githubusercontent.com/u/37429838?v=4",
    "description": "记录一些糟糕的设计或者容易让人犯错的代码。Keep track of bad designs or code that makes people make mistakes."
  },
  {
    "login": "my-pr",
    "id": 37732157,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3NzMyMTU3",
    "url": "https://api.github.com/orgs/my-pr",
    "repos_url": "https://api.github.com/orgs/my-pr/repos",
    "events_url": "https://api.github.com/orgs/my-pr/events",
    "hooks_url": "https://api.github.com/orgs/my-pr/hooks",
    "issues_url": "https://api.github.com/orgs/my-pr/issues",
    "members_url": "https://api.github.com/orgs/my-pr/members{/member}",
    "public_members_url": "https://api.github.com/orgs/my-pr/public_members{/member}",
    "avatar_url": "https://avatars1.githubusercontent.com/u/37732157?v=4",
    "description": "对其他开源项目的贡献。Contributions to other open source projects."
  },
  {
    "login": "my-handbook",
    "id": 37828201,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3ODI4MjAx",
    "url": "https://api.github.com/orgs/my-handbook",
    "repos_url": "https://api.github.com/orgs/my-handbook/repos",
    "events_url": "https://api.github.com/orgs/my-handbook/events",
    "hooks_url": "https://api.github.com/orgs/my-handbook/hooks",
    "issues_url": "https://api.github.com/orgs/my-handbook/issues",
    "members_url": "https://api.github.com/orgs/my-handbook/members{/member}",
    "public_members_url": "https://api.github.com/orgs/my-handbook/public_members{/member}",
    "avatar_url": "https://avatars1.githubusercontent.com/u/37828201?v=4",
    "description": "收藏非常有用的文档资料.Collect very useful documentation."
  },
  {
    "login": "my-t",
    "id": 37875170,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM3ODc1MTcw",
    "url": "https://api.github.com/orgs/my-t",
    "repos_url": "https://api.github.com/orgs/my-t/repos",
    "events_url": "https://api.github.com/orgs/my-t/events",
    "hooks_url": "https://api.github.com/orgs/my-t/hooks",
    "issues_url": "https://api.github.com/orgs/my-t/issues",
    "members_url": "https://api.github.com/orgs/my-t/members{/member}",
    "public_members_url": "https://api.github.com/orgs/my-t/public_members{/member}",
    "avatar_url": "https://avatars2.githubusercontent.com/u/37875170?v=4",
    "description": ""
  },
  {
    "login": "my-cdn",
    "id": 38171854,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjM4MTcxODU0",
    "url": "https://api.github.com/orgs/my-cdn",
    "repos_url": "https://api.github.com/orgs/my-cdn/repos",
    "events_url": "https://api.github.com/orgs/my-cdn/events",
    "hooks_url": "https://api.github.com/orgs/my-cdn/hooks",
    "issues_url": "https://api.github.com/orgs/my-cdn/issues",
    "members_url": "https://api.github.com/orgs/my-cdn/members{/member}",
    "public_members_url": "https://api.github.com/orgs/my-cdn/public_members{/member}",
    "avatar_url": "https://avatars0.githubusercontent.com/u/38171854?v=4",
    "description": ""
  }
]
```

## LICENSE

### [CC-BY-SA-3.0](https://creativecommons.org/licenses/by-nc-sa/3.0/cn/)

[![](LICENSE.png)](https://creativecommons.org/licenses/by-nc-sa/3.0/cn/)