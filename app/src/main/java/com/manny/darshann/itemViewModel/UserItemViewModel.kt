package com.manny.darshann.itemViewModel

import com.manny.darshann.entity.TempleEntity
import com.manny.darshann.entity.UserEntity
import com.root.sole.Interface.ItemProvider

class UserItemViewModel  (val userEntity: UserEntity, val listener
: TempleListener):
    ItemProvider {
    fun onItemClick(){
        listener.onClick(this)
    }
    interface TempleListener{
        fun onClick( itemProvider: UserItemViewModel)
    }
}