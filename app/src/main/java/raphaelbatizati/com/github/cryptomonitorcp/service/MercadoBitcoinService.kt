package com.github.raphaelbatizati.cryptomonitorcp.service

import com.github.raphaelbatizati.cryptomonitorcp.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("/api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}
