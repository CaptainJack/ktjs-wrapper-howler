package ru.capjack.ktjs.wrapper.howler

external interface HowlOptions {
	var src: Array<String>?
	var volume: Double?
	var html5: Boolean?
	var loop: Boolean?
	var preload: Boolean?
	var autoplay: Boolean
	var mute: Boolean
	var sprite: dynamic
	var rate: Double
	var pool: Int
	var format: Array<String>?
	var xhrWithCredentials: Boolean?
	
	var onload: () -> Unit
	var onloaderror: () -> Unit
	var onplayerror: () -> Unit
	var onplay: () -> Unit
	var onend: () -> Unit
	var onpause: () -> Unit
	var onstop: () -> Unit
	var onmute: () -> Unit
	var onvolume: () -> Unit
	var onrate: () -> Unit
	var onseek: () -> Unit
	var onfade: () -> Unit
}