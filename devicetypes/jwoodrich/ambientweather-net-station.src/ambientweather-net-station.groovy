/**
 *  AmbientWeather.net Station
 *
 *  Copyright 2018 Jason Woodrich (@jwoodrich on github)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "AmbientWeather.net Station", namespace: "jwoodrich", author: "Jason Woodrich") {
		capability "Illuminance Measurement"
		capability "Relative Humidity Measurement"
		capability "Sensor"
		capability "Temperature Measurement"
		capability "Ultraviolet Index"
		capability "Water Sensor"

		attribute "windSpeed", "number"
		attribute "windGust", "number"
		attribute "windDirection", "number"
		attribute "maxDailyGust", "number"
		attribute "hourlyRain", "number"
		attribute "dailyRain", "number"
		attribute "weeklyRain", "number"
		attribute "monthlyRain", "number"
		attribute "totalRain", "number"
		attribute "barometerRelative", "number"
		attribute "barometerAbsolute", "number"
		attribute "temperatureFeelsLike", "number"
		attribute "dewPoint", "number"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
        valueTile("temperature", "device.temperature", decoration: "flat", canChangeIcon: true) {
            state "default", label:'${currentValue}° F', icon: "st.Weather.weather2"
        }
        valueTile("humidity", "device.humidity", decoration: "flat") {
            state "default", label:'${currentValue}%'
        }
        valueTile("hourlyRain", "device.hourlyRain", decoration: "flat") {
            state "default", label:'${currentValue} in',
                  backgroundColors:[
                      [value: 0, color: "#ffffffff"],
                      [value: 0.1, color: "#66ccff"],
                      [value: 1, color: "#000099"]
                  ]
        }
        valueTile("dailyRain", "device.dailyRain", decoration: "flat") {
            state "default", label:'${currentValue} in today',
                  backgroundColors:[
                      [value: 0, color: "#ffffffff"],
                      [value: 0.1, color: "#66ccff"],
                      [value: 1, color: "#000099"]
                  ]
        }
        valueTile("ultravioletIndex", "device.ultravioletIndex", decoration: "flat") {
            state "default", label:'${currentValue}%'
        }
        valueTile("windSpeed", "device.windSpeed", decoration: "flat") {
            state "default", label:'${currentValue} MPH'
        }
        valueTile("windDirection", "device.windDirectionH", decoration: "flat") {
            state "default", label:'${currentValue}'
        }
        valueTile("windGust", "device.windGust", decoration: "flat") {
            state "default", label:'${currentValue} MPH Gust'
        }
		main (["temperature"])
		details(["temperature","humidity","windSpeed","windDirection","windGust","hourlyRain","dailyRain","ultravioletIndex"])
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
    // TODO: handle 'illuminance' attribute
	// TODO: handle 'humidity' attribute
	// TODO: handle 'temperature' attribute
	// TODO: handle 'ultravioletIndex' attribute
	// TODO: handle 'water' attribute
	// TODO: handle 'windSpeed' attribute
	// TODO: handle 'windGust' attribute
	// TODO: handle 'windDirection' attribute
	// TODO: handle 'maxDailyGust' attribute
	// TODO: handle 'hourlyRain' attribute
	// TODO: handle 'dailyRain' attribute
	// TODO: handle 'weeklyRain' attribute
	// TODO: handle 'monthlyRain' attribute
	// TODO: handle 'totalRain' attribute
	// TODO: handle 'barometerRelative' attribute
	// TODO: handle 'barometerAbsolute' attribute
	// TODO: handle 'temperatureFeelsLike' attribute
	// TODO: handle 'dewPoint' attribute

}