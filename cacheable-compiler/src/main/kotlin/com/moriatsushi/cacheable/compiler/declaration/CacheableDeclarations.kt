package com.moriatsushi.cacheable.compiler.declaration

import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext

class CacheableDeclarations(
    val cacheStoreClassDeclaration: CacheStoreClassDeclaration,
) {
    companion object {
        fun find(pluginContext: IrPluginContext): CacheableDeclarations? {
            val cacheStoreClassDeclaration = CacheStoreClassDeclaration.find(pluginContext)
                ?: return null
            return CacheableDeclarations(cacheStoreClassDeclaration)
        }
    }
}