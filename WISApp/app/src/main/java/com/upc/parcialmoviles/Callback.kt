package com.upc.parcialmoviles

import com.upc.parcialmoviles.model.Award


/**
 * Created by Enzo Lizama Paredes on 5/13/20.
 * Contact: lizama.enzo@gmail.com
 */
interface WisItemCallback {
    fun goToAwardDetailPage(award: Award)
    fun goToScientificDetailPage()
}