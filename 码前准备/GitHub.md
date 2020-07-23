# GitHub 规范

GitHub是世界上最大的软件远程仓库，是一个面向开源和私有软件项目的托管平台，使用Git做分布式版本控制。
简单的来说，GitHub就是全是界程序员和组织发布程序代码的平台之一，全世界各地的程序员讲自己写的代码上传到这里与大家分享。



推荐：廖雪峰的GitHub教程（https://www.liaoxuefeng.com/wiki/896043488029600）



## GitHub页面

### 相关名词

**Repository**：仓库，使用仓库存储不同代码

**Star**：收藏，记录有用的仓库

**Fork**：复制克隆项目，在别人项目的基础上进行改进，不会影响本人项目代码

**Pull Request**：发送请求，在Fork的基础上修改代码后提交给原作者

**Watch**：关注，关注项目更新

**Issue**：事务卡片，发现代码BUG，但还未改进



### 仓库管理

一个git库对应一个开源项目，通过git来管理库

#### 创建

Repository name：仓库名称

Description：描述

Initialize the repository with a README：初始化一个介绍文档**README.md**文件

#### 设置

修改仓库状态：公开、私有

修改仓库归档：已归档、只读

删除仓库

#### GitHub搜索技巧

项目名称name

项目描述description

README













## Git

### Git配置

Git GUI：图形化页面

Git Bash：命令行页面



环境配置

1、输入登录账号

```
# 配置用户名
git config --global user.name "username"    //（ "username"是自己的账户名，）
# 配置邮箱
git config --global user.email "username@email.com"     //("username@email.com"注册账号时用的邮箱)
```

2、生成ssh（一般在 C:\Users\你的用户名.ssh，文件id_rsa.pub添加到Gihub管理平台）

```
ssh-keygen -t rsa
```

3、测试

```
ssh -T git@github.com
```

4、初始化本地仓库

```
在当前文件夹下，生成.git隐藏文件
git init
```



### Git工作区域

Git仓库：存放代码

暂存区：暂存已经提交的代码，最后统一提交到git仓库中

工作区：添加、编辑、修改文件



提交文件流程：

git status（工作区） --> git add 文件名（暂存区） -->git commit -m ‘提交描述’（Git仓库）



### 常用的Git命令

克隆代码：git clone http地址/git地址

拉取代码：git pull

切换分支：git checkout branch_name

查看工作区状态：git status

查看往期提交记录：git log

提交到暂存区：git add

提交到本地仓库：git commit -m

提交到远程仓库：git push



## Git站点

### 个人站点

URL：https://用户名.github.io



搭建步骤：

1、创建个人站点：创建仓库，仓库名必须是【用户名.github.io】

2、在仓库下新建index.html文件

注意：

- GitHub pages只支持静态网页
- 仓库里面只能是.html文件



### 项目站点

URL：https://用户名.github.io/仓库名



搭建步骤：

1、进入项目主页，点击【settings】

2、在settings页面点击【Launch automatic page generator】

3、设置新建站点信息

4、选择主题

5、生成网页