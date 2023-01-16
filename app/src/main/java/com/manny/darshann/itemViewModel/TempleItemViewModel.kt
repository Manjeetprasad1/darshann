package com.manny.darshann.itemViewModel

import com.manny.darshann.entity.TempleEntity
import com.root.sole.Interface.ItemProvider

class TempleItemViewModel (val templeEntity: TempleEntity, val listener
: TempleListener):
    ItemProvider {
    fun onItemClick(){
        listener.onClick(this)
    }
    interface TempleListener{
        fun onClick( itemProvider: TempleItemViewModel)
    }
}