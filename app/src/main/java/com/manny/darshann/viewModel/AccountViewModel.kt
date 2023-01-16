package com.manny.darshann.viewModel

import androidx.lifecycle.MutableLiveData
import com.manny.darshann.entity.UserEntity
import com.manny.darshann.itemViewModel.UserItemViewModel
import com.root.sole.Interface.ItemProvider

class AccountViewModel : BaseViewModel(),UserItemViewModel.TempleListener{
    val userEntityLiveData = MutableLiveData<ArrayList<ItemProvider>>()
    init {
        getUserData()
    }

    private fun getUserData() {
        val userEntity = ArrayList<UserEntity>()
        userEntity.add(UserEntity("https://newprofilepic2.photo-cdn.net//assets/images/article/profile.jpg","Pooja","Gotra: Lorem ipsum",
            "Nakshatra: Lorem ipsum","Date of Birth: 09/12/1988","Time of Birth: 06:34 am"))
        userEntity.add(UserEntity("https://newprofilepic2.photo-cdn.net//assets/images/article/profile.jpg","Manjeet","Gotra: Lorem ipsum",
            "Nakshatra: Lorem ipsum","Date of Birth: 09/12/1988","Time of Birth: 06:34 am"))
        userEntity.add(UserEntity("https://newprofilepic2.photo-cdn.net//assets/images/article/profile.jpg","Neha","Gotra: Lorem ipsum",
            "Nakshatra: Lorem ipsum","Date of Birth: 09/12/1988","Time of Birth: 06:34 am"))
        userEntity.add(UserEntity("https://newprofilepic2.photo-cdn.net//assets/images/article/profile.jpg","Anil","Gotra: Lorem ipsum",
            "Nakshatra: Lorem ipsum","Date of Birth: 09/12/1988","Time of Birth: 06:34 am"))

        val data = ArrayList<ItemProvider>()
        for (i in userEntity){
            data.add(UserItemViewModel(i,this))
        }
        userEntityLiveData.value = data
    }

    override fun onClick(itemProvider: UserItemViewModel) {

    }
}