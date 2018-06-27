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
            state "default", label:'${currentValue}° F', icon: "st.Weather.weather2",
                    backgroundColors:[
            [value: 31, color: "#153591"],
            [value: 44, color: "#1e9cbb"],
            [value: 59, color: "#90d2a7"],
            [value: 74, color: "#44b621"],
            [value: 84, color: "#f1d801"],
            [value: 95, color: "#d04e00"],
            [value: 96, color: "#bc2323"]
            ]
        }
        valueTile("temperatureFeelsLike", "device.temperatureFeelsLike", decoration: "flat", canChangeIcon: true) {
            state "default", label:'Feels Like ${currentValue}° F'
        }        
        valueTile("humidity", "device.humidity", decoration: "flat") {
            state "default", label:'${currentValue}% RH'
        }
        valueTile("hourlyRain", "device.hourlyRain", decoration: "flat") {
            state "default", label:'${currentValue} in. this hour',
                  backgroundColors:[
                      [value: 0, color: "#ffffffff"],
                      [value: 0.1, color: "#225bb7"],
                      [value: 1, color: "#054cbf"]
                  ]
        }
        valueTile("dailyRain", "device.dailyRain", decoration: "flat") {
            state "default", label:'${currentValue} in. today',
                  backgroundColors:[
                      [value: 0, color: "#ffffffff"],
                      [value: 0.1, color: "#225bb7"],
                      [value: 1, color: "#054cbf"]
                  ]
        }
        valueTile("ultravioletIndex", "device.ultravioletIndex", decoration: "flat") {
            state "default", label:'${currentValue}% UV Index'
        }
        valueTile("solarRadiation", "device.solarRadiation", decoration: "flat") {
            state "default", label:'${currentValue} W/m\u00b2 Solar Radiation'
        }
        valueTile("windSpeed", "device.windSpeed", decoration: "flat") {
            state "default", label:'${currentValue} MPH Current'
        }
        valueTile("windDirection", "device.windDirectionH", decoration: "flat") {
            state "default", label:'Wind from ${currentValue}'
        }
        valueTile("windGust", "device.windGust", decoration: "flat") {
            state "default", label:'${currentValue} MPH Gust'
        }
        valueTile("maxDailyGust", "device.maxDailyGust", decoration: "flat") {
            state "default", label:'${currentValue} MPH Max Gust'
        }
		main (["temperature"])
		details(["temperature","humidity","temperatureFeelsLike","windDirection","windSpeed","windGust","maxDailyGust","hourlyRain","dailyRain","ultravioletIndex","solarRadiation"])
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
}