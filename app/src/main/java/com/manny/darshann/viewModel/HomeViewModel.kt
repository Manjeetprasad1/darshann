package com.manny.darshann.viewModel

import androidx.lifecycle.MutableLiveData
import com.manny.darshann.entity.TempleEntity
import com.manny.darshann.itemViewModel.TempleItemViewModel
import com.root.sole.Interface.ItemProvider

class HomeViewModel : BaseViewModel(), TempleItemViewModel.TempleListener {
    val templeEntityLiveData = MutableLiveData<ArrayList<ItemProvider>>()

    init {
        getTempleData()
    }

    private fun getTempleData() {
        val templeEntity = ArrayList<TempleEntity>()
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))
        templeEntity.add(TempleEntity("https://cdn.britannica.com/81/157281-050-7CD08E32/Sun-Temple-Konarak-Orissa-India.jpg","Temple","Timing 2:30","open"))

        val data = ArrayList<ItemProvider>()
        for (i in templeEntity){
            data.add(TempleItemViewModel(i,this))
        }
        templeEntityLiveData.value = data
    }

    override fun onClick(itemProvider: TempleItemViewModel) {

    }
}