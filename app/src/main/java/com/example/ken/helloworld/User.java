package com.example.ken.helloworld;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Ken on 2015/5/27.
 */
public class User implements Parcelable {
    private String userName;
    private int id;

    public User(String userName, int id) {
        this.userName=userName;
        this.id=id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //这里不用写
    @Override
    public int describeContents() {
        return 0;
    }

    //这里写入方法,把变量都写进去,desc.write
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getUserName());
        dest.writeInt(getId());
    }

    //定义一个序列化的泛型 名字叫Createor
    public static final Creator<User>  CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source.readString(),source.readInt());
        }

        @Override
        public User[] newArray(int size) {
            return new User[0];
        }
    };
}
