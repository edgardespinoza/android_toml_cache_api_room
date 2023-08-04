package com.eespinor.dictionary.data.mapper

import com.eespinor.dictionary.data.local.BeerEntity
import com.eespinor.dictionary.data.remote.BeerDto
import com.eespinor.dictionary.domain.Beer


fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        firstBrewed = first_brewed,
        description = description,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        firstBrewed = firstBrewed,
        description = description ,
        imageUrl = imageUrl
    )
}

