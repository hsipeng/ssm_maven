maven ssm结构图：


![](https://raw.githubusercontent.com/lirawx/ssm_maven/master/src/main/resources/construct.png)

从eclipse迁移过来的，手动找了pom.xml，然后在idea上重新架构，
然后就遇到了org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)错误


### 原因：

> 原来maven项目的约定配置文件必须放resources里，src目录下的xml文件默认不会编译到target。由于我把mapper.xml放在了src目录里，才导致了错误的发生，该问题的实质是，idea对classpath的规定。在eclipse中，把资源文件放在src文件夹下，是可以找到的；但是在idea中，直接把资源文件放在src文件夹下，如果不进行设置，是不能被找到的。

### 解决方案有2种：

1、可以把xml文件放到resource目录下，这样项目构建的时候会加载到target。

2、在pom.xml文件build添加resource资源列表。