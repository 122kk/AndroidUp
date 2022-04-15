# Fragment 使用

***

## 新建一个xxx.xml文件

***

### 这里写的是FrameLayout里的布局

<br/><br/>

## 新建extends Fragment的类(Fragment管理器)

***

### 有两种包(建议选择android.support.v4.app.Fragment这个包,因为这个包可以兼容1.6版本的Android,而android.app.Fragment只能兼容3.0以上的Android)

### 重写onCreateView方法(获取对应的标签,并设置相应的值来设置碎片里的布局)

![44](https://122kk.github.io/AndroidUp/Fragment%E7%9A%84%E4%BD%BF%E7%94%A8(%E7%AE%80%E5%8D%95%E7%9A%84%E6%94%AF%E4%BB%98%E5%AE%9D%E6%A1%88%E4%BE%8B)/main/1.png)

<br/><br/>

## 编辑主文件布局

***

### 建议使用相对布局,用android:layout_alignParentBottom="true"可以将底部控制碎片切换的按钮或TextView固定在底部,添加FrameLayout标签

<br/><br/>

## 编辑主活动

***

### (1)创建Fragment的对象(就是之前继承Fragment的类)

### (2)获取FragmentManager(Fragment管理器)的实例

`FragmentManager fragmentManager=getSupportFragmentManager() `

### (3)开启FragmentTransaction事务

`FragmentTransaction fTransaction=fragmentManager.beginTransaction()`

### (4)提交事务

`fTransaction.commit();`