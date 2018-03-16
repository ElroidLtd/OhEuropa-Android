package com.oheuropa.android.ui.compass

import com.oheuropa.android.ui.base.LocationEnabledPres
import com.oheuropa.android.ui.base.LocationEnabledView

/**
 *
 * Class: com.oheuropa.android.ui.compass.CompassContract
 * Project: OhEuropa-Android
 * Created Date: 06/03/2018 13:26
 *
 * @author <a href="mailto:e@elroid.com">Elliot Long</a>
 *         Copyright (c) 2018 Elroid Ltd. All rights reserved.
 */
interface CompassContract {
	interface View : LocationEnabledView {
		fun displayNewReading(newBeaconReading: Float, newNorthReading: Float, newDistanceMeters: Int)
		fun showCompass()
		fun showSongInfo(songTitle: String, performerName: String)
	}

	interface Presenter : LocationEnabledPres
}