package me.fortibrine.prison.di.module

import dagger.Binds
import dagger.Module
import me.fortibrine.prison.acceptor.PlayerAcceptorImpl
import me.fortibrine.prison.api.acceptor.PlayerAcceptor
import me.fortibrine.prison.api.data.player.PlayerManager
import me.fortibrine.prison.data.player.MongoPlayerManager
import javax.inject.Singleton

@Module
abstract class BindsModule {

    @Binds
    @Singleton
    abstract fun providePlayerManager(mongoPlayerManager: MongoPlayerManager): PlayerManager

    @Binds
    @Singleton
    abstract fun providePlayerAcceptor(playerAcceptorImpl: PlayerAcceptorImpl): PlayerAcceptor

}
