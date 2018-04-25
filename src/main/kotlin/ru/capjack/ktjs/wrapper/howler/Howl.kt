@file:JsModule("ktjs-wrapper-howler/howler.core.min")

package ru.capjack.ktjs.wrapper.howler

external class Howl(options: HowlOptions) {
	/**
	 * Play a sound
	 */
	fun play(): Int?
	
	/**
	 * Resume previous playback
	 */
	fun play(id: Int): Int?
	
	/**
	 * Play a sound for sprite playback
	 */
	fun play(sprite: String): Int?
	
	/**
	 * Pause all playbacks and save current position
	 */
	fun pause(): Howl
	
	/**
	 * Pause playback and save current position
	 */
	fun pause(id: Int): Howl
	
	/**
	 * Stop all playbacks and reset to start
	 */
	fun stop(): Howl
	
	/**
	 * Stop playback and reset to start
	 */
	fun stop(id: Int): Howl
	
	/**
	 * Mute/unmute all sounds in group
	 */
	fun mute(muted: Boolean): Howl
	
	/**
	 * Mute/unmute a sound
	 */
	fun mute(muted: Boolean, id: Int): Howl
	
	fun volume(): Double
	
	fun volume(id: Int): Double
	
	fun volume(volume: Double): Howl
	
	fun volume(volume: Double, id: Int): Howl
	
	fun fade(from: Double, to: Double, duration: Int): Howl
	
	fun fade(from: Double, to: Double, duration: Int, id: Int): Howl
	
	fun rate(): Double
	
	fun rate(id: Int): Double
	
	fun rate(rate: Double): Howl
	
	fun rate(rate: Double, id: Int): Howl
	
	fun seek(): Double
	
	fun seek(id: Int): Double
	
	fun seek(seek: Double): Howl
	
	fun seek(seek: Double, id: Int)
	
	fun loop(): Boolean
	
	fun loop(id: Int): Boolean
	
	fun loop(loop: Boolean): Howl
	
	fun loop(loop: Boolean, id: Int): Howl
	
	fun state(): String
	
	fun playing(): Boolean
	
	fun playing(id: Int): Boolean
	
	fun duration(): Double
	
	fun duration(id: Int): Double
	
	/**
	 * Load the audio file
	 */
	fun load(): Howl
	
	fun unload()
	
	fun on(event: String, function: () -> Unit): Howl
	
	fun on(event: String, function: () -> Unit, id: Int): Howl
	
	fun once(event: String, function: () -> Unit): Howl
	
	fun once(event: String, function: () -> Unit, id: Int): Howl
	
	fun off(event: String, function: () -> Unit): Howl
	
	fun off(event: String, function: () -> Unit, id: Int): Howl
}
