package com.flipperdevices.faphub.installation.button.api

import com.flipperdevices.faphub.dao.api.model.FapItem
import com.flipperdevices.faphub.dao.api.model.FapItemShort
import com.flipperdevices.faphub.dao.api.model.FapItemVersion

data class FapButtonConfig(
    val applicationUid: String,
    val applicationAlias: String,
    val version: FapItemVersion,
    val categoryAlias: String
)

fun FapItemShort.toFapButtonConfig() = FapButtonConfig(
    applicationAlias = applicationAlias,
    version = upToDateVersion,
    applicationUid = id,
    categoryAlias = category.name
)

fun FapItem.toFapButtonConfig() = FapButtonConfig(
    applicationAlias = applicationAlias,
    version = upToDateVersion,
    applicationUid = id,
    categoryAlias = category.name
)
