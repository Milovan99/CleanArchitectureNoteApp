package com.plcoding.cleanarchitecturenoteapp.feauter_note.domain.util

sealed class OrderType
{
    object Ascending:OrderType()
    object Descending:OrderType()
}