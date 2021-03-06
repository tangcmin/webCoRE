/*
 *  webCoRE - Community's own Rule Engine - Web Edition
 *
 *  Copyright 2016 Adrian Caramaliu <ady624("at" sign goes here)gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Version history
*/
public static String version() { return "v0.1.09a.20170501" }
/*
 *	05/01/2017 >>> v0.1.09a.20170501 - BETA M1 - Some visual UI fixes, added ternary operator support in expressions ( condition ? trueValue : falseValue ) - even with Groovy-style support for ( object ?: falseValue)
 *	05/01/2017 >>> v0.1.099.20170501 - BETA M1 - Lots of fixes and improvements - expressions now accept more logical operators like !, !!, ==, !=, <, >, <=, >= and some new math operators like \ (integer division) and % (modulo)
 *	04/30/2017 >>> v0.1.098.20170430 - BETA M1 - Minor bug fixes
 *	04/29/2017 >>> v0.1.097.20170429 - BETA M1 - First Beta Milestone 1!
 *	04/29/2017 >>> v0.0.096.20170429 - ALPHA - Various bug fixes, added options to disable certain statements, as per @eibyer's original idea and @RobinWinbourne's annoying persistance :)
 *	04/29/2017 >>> v0.0.095.20170429 - ALPHA - Fully implemented the on event statements
 *	04/28/2017 >>> v0.0.094.20170428 - ALPHA - Fixed a bug preventing timers from scheduling properly. Added the on statement and the do statement
 *	04/28/2017 >>> v0.0.093.20170428 - ALPHA - Fixed bugs (piston state issues, time condition schedules ignored offsets). Implemented more virtual commands (the fade suite)
 *	04/27/2017 >>> v0.0.092.20170427 - ALPHA - Added time trigger happens daily at...
 *	04/27/2017 >>> v0.0.091.20170427 - ALPHA - Various improvements and fixes
 *	04/26/2017 >>> v0.0.090.20170426 - ALPHA - Minor fixes for variables and the eq() function
 *	04/26/2017 >>> v0.0.08f.20170426 - ALPHA - Implemented $args and the special $args.<dynamic> variables to read arguments from events. Bonus: ability to parse JSON data to read subitem by using $args.item.subitem (no array support yet)
 *	04/26/2017 >>> v0.0.08e.20170426 - ALPHA - Implemented Send notification to contacts
 *	04/26/2017 >>> v0.0.08d.20170426 - ALPHA - Timed triggers should now play nice with multiple devices (any/all)
 *	04/25/2017 >>> v0.0.08c.20170425 - ALPHA - Various fixes and improvements and implemented custom commands with parameters
 *	04/24/2017 >>> v0.0.08b.20170424 - ALPHA - Fixed a bug preventing subscription to IFTTT events
 *	04/24/2017 >>> v0.0.08a.20170424 - ALPHA - Implemented Routine/AskAlexa/EchoSistant/IFTTT integrations - arguments (where available) are not processed yet - not tested
 *	04/24/2017 >>> v0.0.089.20170424 - ALPHA - Added variables in conditions and matching/non-matching device variable output
 *	04/23/2017 >>> v0.0.088.20170423 - ALPHA - Time condition offsets
 *	04/23/2017 >>> v0.0.087.20170423 - ALPHA - Timed triggers (stay/stays) implemented - need additional work to get them to play nicely with "Any of devices stays..." - this never worked in CoRE, but proved to might-have-been-helpful
 *	04/23/2017 >>> v0.0.086.20170423 - ALPHA - Subscriptions to @global variables
 *	04/22/2017 >>> v0.0.085.20170422 - ALPHA - Fixed a bug with virtual device options
 *	04/22/2017 >>> v0.0.084.20170422 - ALPHA - NFL integration complete LOL (not really, implemented global variables though)
 *	04/21/2017 >>> v0.0.083.20170421 - ALPHA - Fixed a bug introduced during device-typed variable refactoring, $currentEventDevice was not properly stored as a List of device Ids
 *	04/21/2017 >>> v0.0.082.20170421 - ALPHA - Fixed a pseudo-bug where older pistons (created before some parameters were added) are missing some operands and that causes errors during evaluations
 *	04/21/2017 >>> v0.0.081.20170421 - ALPHA - Fixed a bug preventing a for-each to work with device-typed variables
 *	04/21/2017 >>> v0.0.080.20170421 - ALPHA - Fixed a newly introduced bug where function parameters were parsed as strings, also fixed functions time, date, and datetime's timezone
 *	04/21/2017 >>> v0.0.07f.20170421 - ALPHA - Fixed an inconsistency in setting device variable (array) - this was in the UI and may require resetting the variables
 *	04/21/2017 >>> v0.0.07e.20170421 - ALPHA - Fixed a bug with local variables introduced in 07d
 *	04/21/2017 >>> v0.0.07d.20170421 - ALPHA - Lots of improvements for device variables
 *	04/20/2017 >>> v0.0.07c.20170420 - ALPHA - Timed conditions are finally working (was* and changed/not changed), basic tests performed
 *	04/19/2017 >>> v0.0.07b.20170419 - ALPHA - First attempt to get 'was' conditions up and running
 *	04/19/2017 >>> v0.0.07a.20170419 - ALPHA - Minor bug fixes, triggers inside timers no longer subscribe to events (the timer is a trigger itself) - triggers should not normally be used inside timers
 *	04/19/2017 >>> v0.0.079.20170419 - ALPHA - Time condition restrictions are now working, added date and date&time conditions, offsets still missing
 *	04/18/2017 >>> v0.0.078.20170418 - ALPHA - Time conditions now subscribe for time events - added restrictions to UI dialog, but not yet implemented
 *	04/18/2017 >>> v0.0.077.20170418 - ALPHA - Implemented time conditions - no date or datetime yet, also, no subscriptions for time events yet
 *	04/18/2017 >>> v0.0.076.20170418 - ALPHA - Implemented task mode restrictions and added setColor using HSL
 *	04/17/2017 >>> v0.0.075.20170417 - ALPHA - Fixed a problem with $sunrise and $sunset pointing to the wrong date
 *	04/17/2017 >>> v0.0.074.20170417 - ALPHA - Implemented HTTP requests, importing response data not working yet, need to figure out a way to specify what data goes into which variables
 *	04/17/2017 >>> v0.0.073.20170417 - ALPHA - isBetween fix - use three params, not two, thanks to @c1arkbar
 *	04/16/2017 >>> v0.0.072.20170416 - ALPHA - Quick fix for isBetween
 *	04/16/2017 >>> v0.0.071.20170416 - ALPHA - Added the ability to execute routines
 *	04/16/2017 >>> v0.0.070.20170416 - ALPHA - Added support for multiple-choice comparisons (any of), added more improvements like the ability to disable event subscriptions (follow up pistons)
 *	04/15/2017 >>> v0.0.06f.20170415 - ALPHA - Fix for wait for date&time
 *	04/15/2017 >>> v0.0.06e.20170415 - ALPHA - Attempt to fix a race condition where device value would change before we even executed - using event's value instead
 *	04/15/2017 >>> v0.0.06d.20170415 - ALPHA - Various fixes and improvements, added the ability to execute pistons in the same location (arguments not working yet)
 *	04/15/2017 >>> v0.0.06c.20170415 - ALPHA - Fixed a bug with daily timers and day of week restrictions
 *	04/14/2017 >>> v0.0.06b.20170414 - ALPHA - Added more functions: date(value), time(value), if(condition, valueIfTrue, valueIfFalse), not(value), isEmpty(value), addSeconds(dateTime, seconds), addMinutes(dateTime, minutes), addHours(dateTime, hours), addDays(dateTime, days), addWeeks(dateTime, weeks)
 *	04/14/2017 >>> v0.0.06a.20170414 - ALPHA - Fixed a bug where multiple timers would cancel each other's actions out, implemented (not extensively tested yet) the TCP and TEP
 *	04/13/2017 >>> v0.0.069.20170413 - ALPHA - Various bug fixes and improvements
 *	04/12/2017 >>> v0.0.068.20170412 - ALPHA - Fixed a bug with colors from presets
 *	04/12/2017 >>> v0.0.067.20170412 - ALPHA - Fixed a bug introduced in 066 and implemented setColor
 *	04/12/2017 >>> v0.0.066.20170412 - ALPHA - Fixed hourly timers and implemented setInfraredLevel, setHue, setSaturation, setColorTemperature
 *	04/11/2017 >>> v0.0.065.20170411 - ALPHA - Fix for long waits being converted to scientific notation, causing the scheduler to misunderstand them and wait 1ms instead
 *	04/11/2017 >>> v0.0.064.20170411 - ALPHA - Fix for timer restrictions error
 *	04/11/2017 >>> v0.0.063.20170411 - ALPHA - Some fixes for timers, implemented all timers, implemented all timer restrictions.
 *	04/10/2017 >>> v0.0.062.20170410 - ALPHA - Some fixes for timers, implemented all timers, their restrictions still not active.
 *	04/07/2017 >>> v0.0.061.20170407 - ALPHA - Some fixes for timers (waits inside timers) and implemented weekly timers. Months/years not working yet. Should be more stable.
 *	04/06/2017 >>> v0.0.060.20170406 - ALPHA - Timers for second/minute/hour/day are in. week/month/year not working yet. May be VERY quirky, still.
 *	03/30/2017 >>> v0.0.05f.20170329 - ALPHA - Attempt to fix setLocation, added Twilio integration (dialog support coming soon)
 *	03/29/2017 >>> v0.0.05e.20170329 - ALPHA - Added sendEmail
 *	03/29/2017 >>> v0.0.05d.20170329 - ALPHA - Minor typo fixes, thanks to @rayzurbock
 *	03/28/2017 >>> v0.0.05c.20170328 - ALPHA - Minor fixes regarding location subscriptions
 *	03/28/2017 >>> v0.0.05b.20170328 - ALPHA - Minor fixes for setting location mode
 *	03/27/2017 >>> v0.0.05a.20170327 - ALPHA - Minor fixes - location events do not have a device by default, overriding with location
 *	03/27/2017 >>> v0.0.059.20170327 - ALPHA - Completed SHM status and location mode. Can get/set, can subscribe to changes, any existing condition in pistons needs to be revisited and fixed
 *	03/25/2017 >>> v0.0.058.20170325 - ALPHA - Fixes for major issues introduced due to the new comparison editor (you need to re-edit all comparisons to fix them), added log multiline support, use \r or \n or \r\n in a string
 *	03/24/2017 >>> v0.0.057.20170324 - ALPHA - Improved installation experience, preventing direct installation of child app, location mode and shm status finally working
 *	03/23/2017 >>> v0.0.056.20170323 - ALPHA - Various fixes for restrictions
 *	03/22/2017 >>> v0.0.055.20170322 - ALPHA - Various improvements, including a revamp of the comparison dialog, also moved the dashboard website to https://dashboard.webcore.co
 *	03/21/2017 >>> v0.0.054.20170321 - ALPHA - Moved the dashboard website to https://webcore.homecloudhub.com/dashboard/
 *	03/21/2017 >>> v0.0.053.20170321 - ALPHA - Fixed a bug where variables containing expressions would be cast to the variable type outside of evaluateExpression (the right way)
 *	03/20/2017 >>> v0.0.052.20170320 - ALPHA - Fixed $shmStatus
 *	03/20/2017 >>> v0.0.051.20170320 - ALPHA - Fixed a problem where start values for variables would not be correctly picked up from atomicState (used state by mistake)
 *	03/20/2017 >>> v0.0.050.20170320 - ALPHA - Introducing parallelism, a semaphore mechanism to allow synchronization of multiple simultaneous executions, disabled by default (pistons wait at a semaphore)
 *	03/20/2017 >>> v0.0.04f.20170320 - ALPHA - Minor fixes for device typed variables (lost attribute) and counter variable in for each
 *	03/20/2017 >>> v0.0.04e.20170320 - ALPHA - Major operand/expression/cast refactoring to allow for arrays of devices - may break things. Also introduced for each loops and actions on device typed variables
 *	03/19/2017 >>> v0.0.04d.20170319 - ALPHA - Fixes for functions and device typed variables
 *	03/19/2017 >>> v0.0.04c.20170319 - ALPHA - Device typed variables now enabled - not yet possible to use them in conditions or in actions, but getting there
 *	03/18/2017 >>> v0.0.04b.20170318 - ALPHA - Various fixes
 *	03/18/2017 >>> v0.0.04a.20170318 - ALPHA - Enabled manual piston status and added the set piston status task as well as the exit statement
 *	03/18/2017 >>> v0.0.049.20170318 - ALPHA - Third attempt to fix switch
 *	03/18/2017 >>> v0.0.048.20170318 - ALPHA - Second attempt to fix switch fallbacks with wait breaks, wait in secondary cases were not working
 *	03/18/2017 >>> v0.0.047.20170318 - ALPHA - Attempt to fix switch fallbacks with wait breaks
 *	03/18/2017 >>> v0.0.046.20170318 - ALPHA - Various critical fixes - including issues with setLevel without a required state
 *	03/18/2017 >>> v0.0.045.20170318 - ALPHA - Fixed a newly introduced bug for Toggle (missing parameters)
 *	03/17/2017 >>> v0.0.044.20170317 - ALPHA - Cleanup ghost else-ifs on piston save
 *	03/17/2017 >>> v0.0.043.20170317 - ALPHA - Added "View piston in dashboard" to child app UI
 *	03/17/2017 >>> v0.0.042.20170317 - ALPHA - Various fixes and enabled restrictions - UI for conditions and restrictions needs refactoring to use the new operand editor
 *	03/16/2017 >>> v0.0.041.20170316 - ALPHA - Various fixes
 *	03/16/2017 >>> v0.0.040.20170316 - ALPHA - Fixed a bug where optional parameters were not correctly interpreted, leading to setLevel not working, added functions startsWith, endsWith, contains, eq, le, lt, ge, gt
 *	03/16/2017 >>> v0.0.03f.20170316 - ALPHA - Completely refactored task parameters and enabled variables. Dynamically assigned variables act as functions - it can be defined as an expression and reuse it in lieu of that expression
 *	03/15/2017 >>> v0.0.03e.20170315 - ALPHA - Various improvements
 *	03/14/2017 >>> v0.0.03d.20170314 - ALPHA - Fixed a bug with caching operands for triggers
 *	03/14/2017 >>> v0.0.03c.20170314 - ALPHA - Fixed a bug with switches
 *	03/14/2017 >>> v0.0.03b.20170314 - ALPHA - For statement finally getting some love
 *	03/14/2017 >>> v0.0.03a.20170314 - ALPHA - Added more functions (age, previousAge, newer, older, previousValue) and fixed a bug where operand caching stopped working after earlier code refactorings
 *	03/13/2017 >>> v0.0.039.20170313 - ALPHA - The Switch statement should now be functional - UI validation not fully done
 *	03/12/2017 >>> v0.0.038.20170312 - ALPHA - Traversing else ifs and else statements in search for devices to subscribe to
 *	03/12/2017 >>> v0.0.037.20170312 - ALPHA - Added support for break and exit (partial, piston state is not set on exit) - fixed some comparison data type incompatibilities
 *	03/12/2017 >>> v0.0.036.20170312 - ALPHA - Added TCP = cancel on condition change and TOS = Action - no other values implemented yet, also, WHILE loops are now working, please remember to add a WAIT in it...
 *	03/11/2017 >>> v0.0.035.20170311 - ALPHA - A little error creeped into the conditions, fixed it
 *	03/11/2017 >>> v0.0.034.20170311 - ALPHA - Multiple device selection aggregation now working properly. COUNT(device list's contact) rises above 1 will be true when at least two doors in the list are open :D
 *	03/11/2017 >>> v0.0.033.20170311 - ALPHA - Implemented all conditions except "was..." and all triggers except "stays..."
 *	03/11/2017 >>> v0.0.032.20170311 - ALPHA - Fixed setLevel null params and added version checking
 *	03/11/2017 >>> v0.0.031.20170310 - ALPHA - Various fixes including null optional parameters, conditional groups, first attempt at piston restrictions (statement restrictions not enabled yet), fixed a problem with subscribing device bolt indicators only showing for one instance of each device/attribute pair, fixed sendPushNotification
 *	03/10/2017 >>> v0.0.030.20170310 - ALPHA - Fixed a bug in scheduler introduced in 02e/02f
 *	03/10/2017 >>> v0.0.02f.20170310 - ALPHA - Various improvements, added toggle and toggleLevel
 *	03/10/2017 >>> v0.0.02e.20170310 - ALPHA - Fixed a problem where long expiration settings prevented logins (integer overflow)
 *	03/10/2017 >>> v0.0.02d.20170310 - ALPHA - Reporting version to JS
 *	03/10/2017 >>> v0.0.02c.20170310 - ALPHA - Various improvements and a new virtual command: Log to console. Powerful.
 *	03/10/2017 >>> v0.0.02b.20170310 - ALPHA - Implemented device versioning to correctly handle multiple browsers accessing the same dashboard after a device selection was performed, enabled security token expiry
 *	03/09/2017 >>> v0.0.02a.20170309 - ALPHA - Fixed parameter issues, added support for expressions in all parameters, added notification virtual tasks
 *	03/09/2017 >>> v0.0.029.20170309 - ALPHA - More execution flow fixes, sticky trace lines fixed
 *	03/08/2017 >>> v0.0.028.20170308 - ALPHA - Scheduler fixes
 *	03/08/2017 >>> v0.0.027.20170308 - ALPHA - Very early implementation of wait/delay scheduling, needs extensive testing
 *	03/08/2017 >>> v0.0.026.20170308 - ALPHA - More bug fixes, trace enhancements
 *	03/07/2017 >>> v0.0.025.20170307 - ALPHA - Improved logs and traces, added basic time event handler
 *	03/07/2017 >>> v0.0.024.20170307 - ALPHA - Improved logs (reverse order and live updates) and added trace support
 *	03/06/2017 >>> v0.0.023.20170306 - ALPHA - Added logs to the dashboard
 *	03/05/2017 >>> v0.0.022.20170305 - ALPHA - Some tasks are now executed. UI has an issue with initializing params on editing a task, will get fixed soon.
 *	03/01/2017 >>> v0.0.021.20170301 - ALPHA - Most conditions (and no triggers yet) are now parsed and evaluated during events - action tasks not yet executed, but getting close, very close
 *	02/28/2017 >>> v0.0.020.20170228 - ALPHA - Added runtime data - pistons are now aware of devices and global variables - expressions can query devices and variables (though not all system variables are ready yet)
 *	02/27/2017 >>> v0.0.01f.20170227 - ALPHA - Added support for a bunch more functions
 *	02/27/2017 >>> v0.0.01e.20170227 - ALPHA - Fixed a bug in expression parser where integer + integer would result in a string
 *	02/27/2017 >>> v0.0.01d.20170227 - ALPHA - Made progress evaluating expressions
 *	02/24/2017 >>> v0.0.01c.20170224 - ALPHA - Added functions support to main app
 *	02/06/2017 >>> v0.0.01b.20170206 - ALPHA - Fixed a problem with selecting thermostats
 *	02/01/2017 >>> v0.0.01a.20170201 - ALPHA - Updated comparisons
 *	01/30/2017 >>> v0.0.019.20170130 - ALPHA - Improved comparisons - ouch
 *	01/29/2017 >>> v0.0.018.20170129 - ALPHA - Fixed a conditions where devices would not be sent over to the UI
 *	01/28/2017 >>> v0.0.017.20170128 - ALPHA - Incremental update
 *	01/27/2017 >>> v0.0.016.20170127 - ALPHA - Minor compatibility fixes
 *	01/27/2017 >>> v0.0.015.20170127 - ALPHA - Updated capabilities, attributes, commands and refactored them into maps
 *	01/26/2017 >>> v0.0.014.20170126 - ALPHA - Progress getting comparisons to work
 *	01/25/2017 >>> v0.0.013.20170125 - ALPHA - Implemented the author field and more improvements to the piston editor
 *	01/23/2017 >>> v0.0.012.20170123 - ALPHA - Implemented the "delete" piston
 *	01/23/2017 >>> v0.0.011.20170123 - ALPHA - Fixed a bug where account id was not hashed
 *	01/23/2017 >>> v0.0.010.20170123 - ALPHA - Duplicate piston and restore from automatic backup :)
 *	01/23/2017 >>> v0.0.00f.20170123 - ALPHA - Automatic backup to myjson.com is now enabled. Restore is not implemented yet.
 *	01/22/2017 >>> v0.0.00e.20170122 - ALPHA - Enabled device cache on main app to speed up dashboard when using large number of devices
 *	01/22/2017 >>> v0.0.00d.20170122 - ALPHA - Optimized data usage for piston JSON class (might have broken some things), save now works
 *	01/21/2017 >>> v0.0.00c.20170121 - ALPHA - Made more progress towards creating new pistons
 *	01/21/2017 >>> v0.0.00b.20170121 - ALPHA - Made progress towards creating new pistons
 *	01/20/2017 >>> v0.0.00a.20170120 - ALPHA - Fixed a problem with dashboard URL and shards other than na01
 *	01/20/2017 >>> v0.0.009.20170120 - ALPHA - Reenabled the new piston UI at new URL
 *	01/20/2017 >>> v0.0.008.20170120 - ALPHA - Enabled html5 routing and rewrite to remove the /#/ contraption
 *	01/20/2017 >>> v0.0.007.20170120 - ALPHA - Cleaned up CoRE ST UI and removed "default" theme from URL.
 *	01/19/2017 >>> v0.0.006.20170119 - ALPHA - UI is now fully moved and security enabled - security password is now required
 *	01/18/2017 >>> v0.0.005.20170118 - ALPHA - Moved UI to homecloudhub.com and added support for pretty url (core.homecloudhub.com) and web+core:// handle
 *	01/17/2017 >>> v0.0.004.20170117 - ALPHA - Updated to allow multiple instances
 *	01/17/2017 >>> v0.0.003.20170117 - ALPHA - Improved security, object ids are hashed, added multiple-location-multiple-instance support (CoRE will be able to work across multiple location and installed instances)
 *	12/02/2016 >>> v0.0.002.20161202 - ALPHA - Small progress, Add new piston now points to the piston editor UI
 *	10/28/2016 >>> v0.0.001.20161028 - ALPHA - Initial release
 */
 
/******************************************************************************/
/*** webCoRE DEFINITION														***/
/******************************************************************************/
private static String handle() { return "webCoRE" }
definition(
    name: "webCoRE Piston",
    namespace: "ady624",
    author: "Adrian Caramaliu",
    description: "Do not install this directly, use webCoRE instead",
    category: "Convenience",
	parent: "ady624:webCoRE",
    /* icons courtesy of @chauger - thank you */
	iconUrl: "https://cdn.rawgit.com/ady624/webCoRE/master/resources/icons/app-CoRE.png",
	iconX2Url: "https://cdn.rawgit.com/ady624/webCoRE/master/resources/icons/app-CoRE@2x.png",
	iconX3Url: "https://cdn.rawgit.com/ady624/webCoRE/master/resources/icons/app-CoRE@3x.png"
)


preferences {
	//common pages
	page(name: "pageMain")
}

/******************************************************************************/
/*** 																		***/
/*** CONFIGURATION PAGES													***/
/*** 																		***/
/******************************************************************************/
def pageMain() {
	//webCoRE Piston main page
	return dynamicPage(name: "pageMain", title: "", uninstall: false) {
    	if (!parent.isInstalled()) {        
        	section() {
				paragraph "Sorry, you cannot install a piston directly from the Marketplace, please use the webCoRE SmartApp instead."
            }
        	section("Installing webCoRE") {
            	paragraph "If you are trying to install webCoRE, please go back one step and choose webCoRE, not webCoRE Piston. You can also visit wiki.webcore.co for more information on how to install and use webCoRE"
				href "", title: "More information ${parent.getWikiUrl()}", style: "external", url: parent.getWikiUrl(), image: "https://cdn.rawgit.com/ady624/webCoRE/master/resources/icons/app-CoRE.png", required: false
            }
        } else {
            def currentState = state.currentState

            section ("General") {
                label name: "name", title: "Name", required: true, state: (name ? "complete" : null), defaultValue: parent.generatePistonName()
            }

            section("Dashboard") {        
                def dashboardUrl = parent.getDashboardUrl()
                if (dashboardUrl) {
                    dashboardUrl = "${dashboardUrl}piston/${hashId(app.id)}"
                    href "", title: "View piston in dashboard", style: "external", url: dashboardUrl, image: "https://cdn.rawgit.com/ady624/CoRE/master/resources/images/icons/dashboard.png", required: false
                } else {
                    paragraph "Sorry, your dashboard does not seem to be enabled, please go to the parent app and enable the dashboard."
                }
            }

            section(title:"Application Info") {
                paragraph version(), title: "Version"
                paragraph mem(), title: "Memory Usage"
            }
        }
	}
}

/******************************************************************************/
/*** 																		***/
/*** PUBLIC METHODS															***/
/*** 																		***/
/******************************************************************************/

def installed() {
   	state.created = now()
    state.modified = now()
    state.build = 0
    state.piston = [:]
    state.vars = state.vars?: [:]
    state.subscriptions = state.subscriptions ?: [:]
	initialize()
	return true
}

def updated() {
	unsubscribe()
	initialize()
	return true
}

def initialize() {
	if (!!state.active) {
    	resume()
    }
}

def get() {
	return [
    	meta: [
			id: hashId(app.id),
    		author: state.author,
    		name: app.label,
    		created: state.created,
	    	modified: state.modified,
	    	build: state.build,
	    	bin: state.bin,
	    	active: state.active
		],
        piston: state.piston,
        systemVars: getSystemVariablesAndValues(),
        subscriptions: state.subscriptions,
	    stats: state.stats,
        state: state.state,
        logs: state.logs,
        trace: state.trace,
        localVars: state.vars,
        memory: mem(),
        lastExecuted: state.lastExecuted,
        nextSchedule: state.nextSchedule,
        schedules: state.schedules
    ]
}

def activity(lastLogTimestamp) {
	def logs = state.logs
    def llt = lastLogTimestamp && lastLogTimestamp instanceof String && lastLogTimestamp.isLong() ? lastLogTimestamp.toLong() : 0
    def index = llt ? logs.findIndexOf{ it.t == llt } : 0
    index = index > 0 ? index : 0
	return [
    	name: app.label,
        state: state.state,
    	logs: index ? logs[0..index-1] : [],		
    	trace: state.trace,
        localVars: state.vars,
        memory: mem(),
        lastExecuted: state.lastExecuted,
        nextSchedule: state.nextSchedule,
        schedules: state.schedules
    ]    
}


def set(data) {
	if (!data) return false
	state.modified = now()
    state.build = (int)(state.build ? (int)state.build + 1 : 1)
    def piston = [
    	o: data.o ?: {},
    	r: data.r ?: [],
    	rn: !!data.rn,
		rop: data.rop ?: 'and',
		s: data.s ?: [],
        v: data.v ?: [],
        z: data.z ?: ''
    ]
    if (data.n) app.updateLabel(data.n)
    setIds(piston)
    state.piston = piston
    state.trace = [:]
    state.schedules = []
    state.vars = state.vars ?: [:];
    //todo replace this
    Map rtData
    if ((state.build == 1) || (!!state.active)) {
    	rtData = resume()
    }
    return [active: state.active, build: state.build, modified: state.modified, rtData: rtData]
}


private int setIds(node, maxId = 0, existingIds = [:], requiringIds = [], level = 0) {
    if (node?.t in ['if', 'while', 'repeat', 'for', 'each', 'switch', 'action', 'every', 'condition', 'restriction', 'group', 'do', 'on', 'event']) {
        def id = node['$']
        if (!id || existingIds[id]) {
            requiringIds.push(node)
        } else {
            maxId = maxId < id ? id : maxId
            existingIds[id] = id
        }
        if ((node.t == 'if') && (node.ei)) {
        	node.ei.removeAll{ !it.c && !it.s }
			for (elseIf in node.ei) {
		        id = elseIf['$']
                if (!id || existingIds[id]) {               
                    requiringIds.push(elseIf)
                } else {
                    maxId = (maxId < id) ? id : maxId
                    existingIds[id] = id
                }
            }
        }
        if ((node.t == 'switch') && (node.cs)) {
			for (_case in node.cs) {
		        id = _case['$']
                if (!id || existingIds[id]) {               
                    requiringIds.push(_case)
                } else {
                    maxId = (maxId < id) ? id : maxId
                    existingIds[id] = id
                }
            }
        }
        if ((node.t == 'action') && (node.k)) {
			for (task in node.k) {
		        id = task['$']
                if (!id || existingIds[id]) {               
                    requiringIds.push(task)
                } else {
                    maxId = (maxId < id) ? id : maxId
                    existingIds[id] = id
                }
            }
        }
    }
	for (list in node.findAll{ it.value instanceof List }) { 
        for (item in list.value.findAll{ it instanceof Map }) {
            maxId = setIds(item, maxId, existingIds, requiringIds, level + 1)
        }
    }
    if (level == 0) {
    	for (item in requiringIds) {
        	maxId += 1
        	item['$'] = maxId
        }
    }
    return maxId
}



def config(data) {
	if (!data) {
    	return false;
    }
	if (data.bin) {
		state.bin = data.bin;
    }
	if (data.author) {
		state.author = data.author;
    }
}

def pause() {
	state.active = false
    def rtData = getRunTimeData()
	def msg = timer "Piston successfully stopped", null, -1
    info "Stopping piston...", rtData, 0
    checkVersion(rtData)
    state.schedules = []
    rtData.stats.nextSchedule = 0
    unsubscribe()
    unschedule()
    state.trace = [:]
    state.subscriptions = [:]
    state.schedules = []
    info msg, rtData
    updateLogs(rtData)
    atomicState.schedules = []
	atomicState.active = false
    return rtData
}

def resume() {
	state.active = true;
	def tempRtData = getTemporaryRunTimeData()
    def msg = timer "Piston successfully started", null,  -1
	info "Starting piston... (${version()})", tempRtData, 0
    def rtData = getRunTimeData(tempRtData)
    checkVersion(rtData)
    state.subscriptions = [:]
    atomicState.schedules = []
    state.schedules = []
    subscribeAll(rtData)    
    info msg, rtData
    updateLogs(rtData)
    rtData.result = [active: true, subscriptions: state.subscriptions]
	atomicState.active = true
    return rtData
}

def execute() {

}

private getTemporaryRunTimeData() {
	return [
    	temporary: true,
       	timestamp: now(),
        logs:[]
    ]
}

private getRunTimeData(rtData = null, semaphore = null) {
	def n = now()
	try {
		def timestamp = rtData?.timestamp ?: now()
	    def piston = state.piston
        def appId = hashId(app.id)
	    def logs = (rtData && rtData.temporary) ? rtData.logs : null
		rtData = (rtData && !rtData.temporary) ? rtData : parent.getRunTimeData((semaphore && !(piston.o?.pep)) ? appId : null)
	    rtData.timestamp = timestamp
	    rtData.logs = [[t: timestamp]]    
	    if (logs && logs.size()) {
	    	logs.removeAll{ !it.c || !rtData.logging[it.c] }
	        rtData.logs = rtData.logs + logs
	    }
	    rtData.trace = [t: timestamp, points: [:]]
	    rtData.id = appId
		rtData.active = state.active;
	    rtData.stats = [nextScheduled: 0]
	    //we're reading the cache from atomicState because we might have waited at a semaphore
	    rtData.cache = atomicState.cache ?: [:]
	    rtData.newCache = [:]
	    rtData.schedules = []
	    rtData.cancelations = [statements:[], conditions:[]]
	    rtData.piston = piston
	    rtData.locationId = hashId(location.id)
        rtData.locationModeId = hashId(location.getCurrentMode().id)
	    //flow control
	    //we're reading the old state from atomicState because we might have waited at a semaphore
	    def oldState = atomicState.state ?: ''
	    rtData.state = [old: oldState, new: oldState];
	    rtData.statementLevel = 0;
	    rtData.fastForwardTo = null
	    rtData.break = false
	    rtData.systemVars = getSystemVariables()
	    rtData.localVars = getLocalVariables(rtData, piston.v)
	} catch(all) {
    	error "Error while getting runtime data:", rtData, null, all
    }
	return rtData    
}

private checkVersion(rtData) {
	def ver = version()
    if (ver != rtData.coreVersion) {
    	//parent and child apps have different versions
        warn "WARNING: Results may be unreliable because the ${ver > rtData.coreVersion ? "child app's version ($ver) is newer than the parent app's version (${rtData.coreVersion})" : "parent app's version (${rtData.coreVersion}) is newer than the child app's version ($ver)" }. Please consider updating both apps to the same version.", rtData
    }    
}

/******************************************************************************/
/*** 																		***/
/*** EVENT HANDLING															***/
/*** 																		***/
/******************************************************************************/
def fakeHandler(event) {
	def rtData = getRunTimeData()
	warn "Received unexpected event [${event.device?:location}].${event.name} = ${event.value} (device has no active subscriptions)... ", rtData
    updateLogs(rtData)
}

def deviceHandler(event) {
	handleEvents(event)
}

def timeHandler(event) {
	handleEvents([date: new Date(event.t), device: location, name: 'time', value: event.t, schedule: event])
}

def timeRecoveryHandler(event) {
	timeHandler(event)
}

def executeHandler(event) {
	handleEvents([date: event.date, device: location, name: 'execute', value: event.value, jsonData: event.jsonData])
}

//entry point for all events
def handleEvents(event) {
	//cancel all pending jobs, we'll handle them later
	unschedule(timeHandler)
	unschedule(timeRecoveryHandler)
    if (!state.active) return
	def startTime = now()
    state.lastExecuted = startTime
    def eventDelay = startTime - event.date.getTime()
	def msg = timer "Event processed successfully", null, -1
    def tempRtData = getTemporaryRunTimeData()
    info "Received event [${event.device?:location}].${event.name} = ${event.value} with a delay of ${eventDelay}ms", tempRtData, 0
    state.temp = [:]
    //todo start execution
    def ver = version()
	def msg2 = timer "Runtime successfully initialized ($ver)"
    Map rtData = getRunTimeData(tempRtData, true)
    checkVersion(rtData)    
    if (rtData.semaphoreDelay) {
    	warn "Piston waited at a semaphore for ${rtData.semaphoreDelay}ms", rtData
    }
    trace msg2, rtData
    rtData.stats.timing = [
    	t: startTime,
    	d: eventDelay > 0 ? eventDelay : 0,
        l: now() - startTime
    ]
    startTime = now()
	msg2 = timer "Execution stage complete.", null, -1
    trace "Execution stage started", rtData, 1
    def success = true
    def syncTime = false    
    if (event.name != 'time') {
    	success = executeEvent(rtData, event)
        syncTime = true
    }
    //process all time schedules in order
    while (success && (20000 + rtData.timestamp - now() > 15000)) {
        //we only keep doing stuff if we haven't passed the 10s execution time mark
        def schedules = atomicState.schedules
        //anything less than 2 seconds in the future is considered due, we'll do some pause to sync with it
        //we're doing this because many times, the scheduler will run a job early, usually 0-1.5 seconds early...
        if (!schedules || !schedules.size()) break
        event = [date: event.date, device: location, name: 'time', value: now(), schedule: schedules.sort{ it.t }.find{ it.t < now() + 2000 }]
        if (!event.schedule) break
        long threshold = now() > event.schedule.t ? now() : event.schedule.t
        //schedules.removeAll{ (it.t <= threshold) && (it.s == event.schedule.s) && (it.i == event.schedule.i) }
        schedules.remove(event.schedule)
        //if we have any other pending -3 events (device schedules), we cancel them all
        //if (event.schedule.i > 0) schedules.removeAll{ (it.s == event.schedule.s) && ( it.i == -3 ) }
        atomicState.schedules = schedules
        def delay = event.schedule.t - now()
        if (syncTime && (delay > 0)) {
        	debug "Fast executing schedules, waiting for ${delay}ms to sync up", rtData
        	pause delay
        }
        if (event.schedule.i == -3) {
        	def data = event.schedule.d
            if (data && data.d && data.c) {
        		//we have a device schedule, execute it
            	def device = getDevice(rtData, data.d)
                if (device) {
                	//executing scheduled physical command
                    //used by fades, flashes, etc.
                	executePhysicalCommand(rtData, device, data.c, data.p)
                }
			}
        } else {
        	success = executeEvent(rtData, event)
        }
        syncTime = true
        //if we waited at a semaphore, we don't want to process too many events
        if (rtData.semaphoreDelay) break
    }
	rtData.stats.timing.e = now() - startTime
    trace msg2, rtData
    if (!success) msg.m = "Event processing failed"
    finalizeEvent(rtData, msg, success)
}

private Boolean executeEvent(rtData, event) {
	try {
    	rtData = rtData ?: getRunTimeData()
        //event processing
		rtData.event = event
        rtData.previousEvent = state.lastEvent
        def index = 0
        if (event.jsonData) {
            def attribute = rtData.attributes[event.name]
            if (attribute && attribute.i && event.jsonData[attribute.i]) {
                index = event.jsonData[attribute.i]
            }
            if (!index) index = 1
        }
        def srcEvent = event && (event.name == 'time') && event.schedule && event.schedule.evt ? event.schedule.evt : null
       	rtData.args = event ? ((event.name == 'time') && event.schedule && event.schedule.args && (event.schedule.args instanceof Map) ? event.schedule.args : (event.jsonData ?: [:])) : [:]
        /*if (event && (event.name == 'time') && event.schedule && event.schedule.stack) {
            setSystemVariableValue(rtData, '$index', event.schedule.stack.index)
            setSystemVariableValue(rtData, '$device', event.schedule.stack.device)
            setSystemVariableValue(rtData, '$devices', event.schedule.stack.devices)
		}*/           
        rtData.currentEvent = [
            date: event.date.getTime(),
            delay: rtData.stats?.timing?.d ?: 0,
            device: srcEvent ? srcEvent.device : hashId((event.device?:location).id),
            name: srcEvent ? srcEvent.name : event.name,
            value: srcEvent ? srcEvent.value : event.value,
            unit: srcEvent ? srcEvent.unit : event.unit,
            physical: srcEvent ? srcEvent.physical : !!event.physical,
            index: index
        ]
        state.lastEvent = rtData.currentEvent
        //previous variables
        rtData.conditionStateChanged = false
        rtData.pistonStateChanged = false
        rtData.fastForwardTo = null
        if (event.name == 'time') {
        	rtData.fastForwardTo = event.schedule.i
        }
		setSystemVariableValue(rtData, '$state', rtData.state.new)
        setSystemVariableValue(rtData, '$previousEventDate', rtData.previousEvent?.date ?: now())
        setSystemVariableValue(rtData, '$previousEventDelay', rtData.previousEvent?.delay ?: 0)
        setSystemVariableValue(rtData, '$previousEventDevice', [rtData.previousEvent?.device])
        setSystemVariableValue(rtData, '$previousEventDeviceIndex', rtData.previousEvent?.index ?: 0)
        setSystemVariableValue(rtData, '$previousEventAttribute', rtData.previousEvent?.name ?: '')
        setSystemVariableValue(rtData, '$previousEventValue', rtData.previousEvent?.value ?: '')
        setSystemVariableValue(rtData, '$previousEventUnit', rtData.previousEvent?.unit ?: '')
        setSystemVariableValue(rtData, '$previousEventDevicePhysical', !!rtData.previousEvent?.physical)
        //current variables
        setSystemVariableValue(rtData, '$currentEventDate', rtData.currentEvent.date ?: now())
        setSystemVariableValue(rtData, '$currentEventDelay', rtData.currentEvent.delay ?: 0)
        setSystemVariableValue(rtData, '$currentEventDevice', [rtData.currentEvent?.device])
        setSystemVariableValue(rtData, '$currentEventDeviceIndex', rtData.currentEvent.index ?: 0)
        setSystemVariableValue(rtData, '$currentEventAttribute', rtData.currentEvent.name ?: '')
        setSystemVariableValue(rtData, '$currentEventValue', rtData.currentEvent.value ?: '')
        setSystemVariableValue(rtData, '$currentEventUnit', rtData.currentEvent.unit ?: '')
        setSystemVariableValue(rtData, '$currentEventDevicePhysical', !!rtData.currentEvent.physical)
		//todo - check restrictions
        rtData.stack = [c: 0, s: 0, cs:[], ss:[]]
        def ended = false
        try {
		    def allowed = !rtData.piston.r || !(rtData.piston.r.length) || evaluateConditions(rtData, rtData.piston, 'r', true)
    		if (allowed || !!rtData.fastForwardTo) {
            	rtData.restricted = !allowed
				if (executeStatements(rtData, rtData.piston.s)) {
                	ended = true
		        	tracePoint(rtData, 'end', 0, 0)
		        }
            } else {
            	warn "Piston execution aborted due to restrictions in effect", rtData
            }
            if (!ended) tracePoint(rtData, 'break', 0, 0)
        } catch (all) {
        	error "An error occurred while executing the event: ", rtData, null, all
        }
        processSchedules rtData
		return true
    } catch(all) {
    	error "An error occurred within executeEvent: ", rtData, null, all
    }
    processSchedules rtData
    return false
}

private finalizeEvent(rtData, initialMsg, success = true) {
	def startTime = now()
    processSchedules(rtData, true)

    if (initialMsg) {
    	if (success) {
        	info initialMsg, rtData
        } else {
        	error initialMsg
        }
    }
    
	updateLogs(rtData)
	//update graph data
    rtData.stats.timing.u = now() - startTime
    def stats = atomicState.stats ?: [:]
    stats.timing = stats.timing ?: []
    stats.timing.push(rtData.stats.timing)
    if (stats.timing.size() > 500) stats.timing = stats.timing[stats.timing.size() - 500..stats.timing.size() - 1]
    rtData.trace.d = now() - rtData.trace.t

	state.state = rtData.state.new
    state.stats = stats
    state.trace = rtData.trace
    //flush the new cache value
    for(item in rtData.newCache) rtData.cache[item.key] = item.value
    //beat race conditions
    state.cache = rtData.cache    
	parent.updateRunTimeData(rtData)
    //overwrite state, might have changed meanwhile
    state.schedules = atomicState.schedules
}

private processSchedules(rtData, scheduleJob = false) {
	//reschedule stuff
    //todo, override tasks, if any
    def schedules = (atomicState.schedules ?: [])
    for (timer in rtData.piston.s.findAll{ it.t == 'every' }) {
    	if (!schedules.find{ it.s == timer.$ } && !rtData.schedules.find{ it.s == timer.$ }) {
        	debug "Rescheduling missing timer ${timer.$}", rtData
    		scheduleTimer(rtData, timer, 0)
        }
    }
	//reset states
    //if automatic states, we set it based on the autoNew - if any
    if (!rtData.piston.o?.mps) {    
    	rtData.state.new = rtData.state.autoNew ?: 'true'
    }
    rtData.state.old = rtData.state.new
	rtData.pistonStateChanged = false
    schedules = (atomicState.schedules ?: [])
    //cancel statements
	schedules.removeAll{ schedule -> !!rtData.cancelations.statements.find{ cancelation -> (cancelation.id == schedule.s) && (!cancelation.data || (cancelation.data == schedule.d)) }}
    //cancel on conditions
	for(cid in rtData.cancelations.conditions) {
    	schedules.removeAll{ cid in it.cs }
    }
    //cancel on piston state change
    if (rtData.pistonStateChanged) {
    	schedules.removeAll{ !!it.ps }
    }
    rtData.cancelations = []
    schedules = (schedules + (rtData.schedules ?: [])).sort{ it.t }
    //add traces for all remaining schedules
    /*for (schedule in schedules) {
    	def t = now() - schedule.t
        if ((t < 0) && (schedule.i > 0) && !rtData.trace.points["t:${schedule.i}"]) {
            //we enter a fake trace point to show it on the trace view
    		tracePoint(rtData, "t:${schedule.i}", 0, t)
        }
    }*/
    if (scheduleJob && schedules.size()) {
    	def next = schedules.sort{ it.t }[0]
        def t = (next.t - now()) / 1000
        t = (t < 1 ? 1 : t)
        rtData.stats.nextSchedule = next.t
        trace "Setting up scheduled job for ${formatLocalTime(next.t)} (in ${t}s)" + (schedules.size() > 1 ? ', with ' + (schedules.size() - 1).toString() + ' more job' + (schedules.size() > 2 ? 's' : '') + ' pending' : ''), rtData
        runIn(t, timeHandler, [data: next])
        runIn(t + 30, timeRecoveryHandler, [data: next])
    } else {
    	rtData.stats.nextSchedule = 0
    }
    atomicState.schedules = schedules
    state.schedules = schedules
    state.nextSchedule = rtData.stats.nextSchedule
    rtData.schedules = []
}

private updateLogs(rtData) {
	//we only save the logs if we got some
	if (!rtData || !rtData.logs || (rtData.logs.size() < 2)) return
    def logs = (rtData.logs?:[]) + (atomicState.logs?:[])
    def maxLogSize = 500
    //we attempt to store 500 logs, but if that's too much, we go down in 50 increments
    while (maxLogSize >= 0) {
	    if (logs.size() > maxLogSize) {
        	def maxSz = maxLogSize < logs.size() ? maxLogSize : logs.size()
            if (maxSz) {
    			logs = logs[0..maxSz]
            } else {
            	logs = []
            }
    	}
        if ("$state".size() > 75000) {
        	maxLogSize -= 50
        } else {
        	break
        }
    }
    atomicState.logs = logs
    state.logs = logs
    rtData.remove('logs')
}



private Boolean executeStatements(rtData, statements, async = false) {
	rtData.statementLevel = rtData.statementLevel + 1
	for(statement in statements) {
    	//only execute statements that are enabled
    	if (!statement.di && !executeStatement(rtData, statement, !!async)) {
        	//stop processing
			rtData.statementLevel = rtData.statementLevel - 1
        	return false
        }
    }
    //continue processing
	rtData.statementLevel = rtData.statementLevel - 1
    return true
}

private Boolean executeStatement(rtData, statement, async = false) {
	//if rtData.fastForwardTo is a positive, non-zero number, we need to fast forward through all
    //branches until we find the task with an id equal to that number, then we play nicely after that
	if (!statement) return false
    if (!rtData.fastForwardTo) {
    	switch (statement.tep) {
        	case 'c':
            	if (!rtData.conditionStateChanged) {
                	debug "Skipping execution for statement #${statement.$} because condition state did not change", rtData
            		return;
                }
                break;
        	case 'p':
            	if (!rtData.pistonStateChanged) {
                	debug "Skipping execution for statement #${statement.$} because piston state did not change", rtData
                	return;
                }
                break;
        	case 'b':
            	if ((!rtData.conditionStateChanged) && (!rtData.pistonStateChanged)) {
                	debug "Skipping execution for statement #${statement.$} because neither condition state nor piston state changed", rtData
                	return;
                }
                break;
        }
    }
    rtData.stack.ss.push(rtData.stack.s)
    rtData.stack.s = statement.$
    def t = now()
    def value = true
    def c = rtData.stack.c
    def stacked = (true /* cancelable on condition change */)
    if (stacked) {
    	rtData.stack.cs.push(c)
    }
    def parentConditionStateChanged = rtData.conditionStateChanged
    def parentAsync = async
    def parentIndex = getVariable(rtData, '$index').v
    def parentDevice = getVariable(rtData, '$device').v
    def selfAsync = (statement.a == "1") || (statement.t == 'every') || (statement.t == 'on')
    async = !!async || selfAsync
    def perform = false
    def repeat = true
    def index = null
    def allowed = !statement.r || !(statement.r.length) || evaluateConditions(rtData, statement, 'r', async)
    if (allowed || !!rtData.fastForwardTo) {
    	while (repeat) {
            switch (statement.t) {
                case 'every':
                	//we override current condition so that child statements can cancel on it
                    def ownEvent = (rtData.event && (rtData.event.name == 'time') && rtData.event.schedule && (rtData.event.schedule.s == statement.$) && (rtData.event.schedule.i < 0))
                    if (ownEvent || !state.schedules.find{ it.s == statement.$ }) {
                    	//if the time has come for our timer, schedule the next timer
                        //if no next time is found quick enough, a new schedule with i = -2 will be setup so that a new attempt can be made at a later time
                    	rtData.fastForwardTo = null
                    	scheduleTimer(rtData, statement, ownEvent ? rtData.event.schedule.t : 0)
                    }
	                rtData.stack.c = statement.$
                    if (!!rtData.fastForwardTo || (ownEvent && allowed && !rtData.restricted)) {
                    	//we don't want to run this if there are piston restrictions in effect
                    	//we only execute the every if i = -1 (for rapid timers with large restrictions i.e. every second, but only on Mondays) we need to make sure we don't block execution while trying
                        //to find the next execution scheduled time, so we give up after too many attempts and schedule a rerun with i = -2 to give us the chance to try again at that later time
                    	if (!!rtData.fastForwardTo || (rtData.event.schedule.i == -1)) executeStatements(rtData, statement.s, true);
                        //we always exit a timer, this only runs on its own schedule, nothing else is executed
                        value = false
                        break
                    }
                    value = true
                    break
                case 'repeat':
                	//we override current condition so that child statements can cancel on it
	                rtData.stack.c = statement.$
                    if (!executeStatements(rtData, statement.s, async)) {
                        //stop processing
                        value = false
                        if (!rtData.fastForwardTo) break
                    }
                    value = true
                    perform = !evaluateConditions(rtData, statement, 'c', async)
                    break
                case 'on':
                    perform = false
                    if (!rtData.fastForwardTo) {
                    	//look to see if any of the event matches
                        def deviceId = (rtData.event.device) ? hashId(rtData.event.device.id) : null
                        for (event in statement.c) {
                        	def operand = event.lo
                            if (operand && operand.t) {
                            	switch (operand.t) {
                                	case 'p':
                                    	if (!!deviceId && (rtData.event.name == operand.a) && !!operand.d && (deviceId in expandDeviceList(rtData, operand.d, true))) perform = true
                                    	break;
                                   	case 'x':
                                    	if ((rtData.event.value == operand.x) && (rtData.event.name == handle())) perform = true                                        
                                    	break;
                                }
                            }
                            if (perform) break
                        }
                    }
                    value = (!!rtData.fastForwardTo || perform) ? executeStatements(rtData, statement.s, async) : true
                    break
				case 'if':
                case 'while':
                    //check conditions for if and while
                    perform = evaluateConditions(rtData, statement, 'c', async)
                	//we override current condition so that child statements can cancel on it
	                rtData.stack.c = statement.$
                    if (!rtData.fastForwardTo && (!rtData.piston.o?.mps) && (statement.t == 'if') && (rtData.statementLevel == 1) && perform) {
                        //automatic piston state                        
                        rtData.state.autoNew = 'true';
                    }
                    
                    if (perform || !!rtData.fastForwardTo) {
                        if (statement.t in ['if', 'while']) {
                            if (!executeStatements(rtData, statement.s, async)) {
                                //stop processing
                                value = false
                                if (!rtData.fastForwardTo) break
                            }
                            value = true
                            if (!rtData.fastForwardTo) break
                        }
                    }
                    if (!perform || !!rtData.fastForwardTo) {
                        if (statement.t == 'if') {
                            //look for else-ifs
                            for (elseIf in statement.ei) {
                                perform = evaluateConditions(rtData, elseIf, 'c', async)
                                if (perform || !!rtData.fastForwardTo) {
                                    if (!executeStatements(rtData, elseIf.s, async)) {
                                        //stop processing
                                        value = false
                                        if (!rtData.fastForwardTo) break
                                    }
                                    value = true
                                    if (!rtData.fastForwardTo) break
                                }                	
                            }
                            if (!rtData.fastForwardTo && (!rtData.piston.o?.mps) && (rtData.statementLevel == 1)) {
                            	//automatic piston state
                                rtData.state.autoNew = 'false';
                            }
                            if ((!perform || !!rtData.fastForwardTo) && !executeStatements(rtData, statement.e, async)) {
                                //stop processing
                                value = false
                                if (!rtData.fastForwardTo) break
                            }
                        }
                    }
                    break
                case 'for':
                case 'each':
                    def devices = []
                    float startValue = 0
                    float endValue = 0
                    float stepValue = 1
                    if (statement.t == 'each') {
                        devices = evaluateOperand(rtData, null, statement.lo).v ?: []
                        endValue = devices.size() - 1
                    } else {
                    	startValue = evaluateScalarOperand(rtData, statement, statement.lo, null, 'decimal').v
                    	endValue = evaluateScalarOperand(rtData, statement, statement.lo2, null, 'decimal').v
                    	stepValue = evaluateScalarOperand(rtData, statement, statement.lo3, null, 'decimal').v ?: 1.0
                    }
                    String counterVariable = getVariable(rtData, statement.x).t != 'error' ? statement.x : null
                    if (((startValue <= endValue) && (stepValue > 0)) || ((startValue >= endValue) && (stepValue < 0)) || !!rtData.fastForwardTo) {
                    	//initialize the for loop
                        if (rtData.fastForwardTo) index = cast(rtData, rtData.cache["f:${statement.$}"], 'decimal')
                    	if (index == null) {
                        	index = cast(rtData, startValue, 'decimal')
	                        rtData.cache["f:${statement.$}"] = index                            
                        }
                        setSystemVariableValue(rtData, '$index', index)
						if ((statement.t == 'each') && !rtData.fastForward) setSystemVariableValue(rtData, '$device', (index < devices.size() ? [devices[(int) index]] : []))
                        if (counterVariable && !rtData.fastForward) setVariable(rtData, counterVariable, (statement.t == 'each') ? (index < devices.size() ? [devices[(int) index]] : []) : index)
                        //do the loop
                        perform = executeStatements(rtData, statement.s, async)                        
                        if (!perform) {
                            //stop processing
                            value = false
                            if (!!rtData.break) {
                                //we reached a break, so we really want to continue execution outside of the switch
                                value = true
                                rtData.break = null
                                perform = false
                            }
                            break
                        }
                        //don't do the rest if we're fast forwarding
                        if (!!rtData.fastForwardTo) break
                        index = index + stepValue
                        setSystemVariableValue(rtData, '$index', index)
						if ((statement.t == 'each') && !rtData.fastForward) setSystemVariableValue(rtData, '$device', (index < devices.size() ? [devices[(int) index]] : []))
                        if (counterVariable && !rtData.fastForward) setVariable(rtData, counterVariable, (statement.t == 'each') ? (index < devices.size() ? [devices[(int) index]] : []) : index)
                        rtData.cache["f:${statement.$}"] = index
                        if (((stepValue > 0 ) && (index > endValue)) || ((stepValue < 0 ) && (index < endValue))) {
                        	perform = false
                            break
                        }                    
                    }
                	break
				case 'switch':
                	def lo = [operand: statement.lo, values: evaluateOperand(rtData, statement, statement.lo)]
                    //go through all cases
                    def found = false
                    def implicitBreaks = (statement.ctp == 'i')
                    def fallThrough = !implicitBreaks
                    perform = false
                    debug "Evaluating switch with values $lo.values", rtData
                    for (_case in statement.cs) {
                    	def ro = [operand: _case.ro, values: evaluateOperand(rtData, _case, _case.ro)]
                        def ro2 = (_case.t == 'r') ? [operand: _case.ro2, values: evaluateOperand(rtData, _case, _case.ro2, null, false, true)] : null
                        perform = perform || evaluateComparison(rtData, (_case.t == 'r' ? 'is_inside_of_range' : 'is'), lo, ro, ro2)
                        found = found || perform
                        if (perform || (found && fallThrough) || !!rtData.fastForwardTo) {
	                        def fastForwardTo = rtData.fastForwardTo
                        	if (!executeStatements(rtData, _case.s, async)) {
 								//stop processing
                                value = false
                                if (!!rtData.break) {
                                	//we reached a break, so we really want to continue execution outside of the switch
                                	value = true
                                    found = true
                                    fallThrough = false
                                    rtData.break = null
                                }
                                if (!rtData.fastForwardTo) {
                                	break
                                }
							}
                            //if we determine that the fast forwarding ended during this execution, we assume found is true
                            found = found || (fastForwardTo != rtData.fastForwardTo)
                            value = true                            
                            //if implicit breaks
                            if (implicitBreaks && !rtData.fastForwardTo) {
                                fallThrough = false
                            	break
                            }
                        }
                    }
                    if (statement.e && statement.e.length && (value || !!rtData.fastForwardTo) && (!found || fallThrough || !!rtData.fastForwardTo)) {
                    	//no case found, let's do the default
						if (!executeStatements(rtData, statement.e, async)) {
                            //stop processing
                            value = false
                            if (!!rtData.break) {
                                //we reached a break, so we really want to continue execution outside of the switch
                                value = true
                                rtData.break = null
                            }
                            if (!rtData.fastForwardTo) break
						}
                    }
                	break
                case 'action':
                    value = executeAction(rtData, statement, async)
                    break
                case 'do':
                	value = executeStatements(rtData, statement.s, async)
                    break
                case 'break':
                	rtData.break = true
                    value = false
                    break
                case 'exit':
                	vcmd_setState(rtData, null, [cast(rtData, evaluateOperand(rtData, null, statement.lo).v, 'string')])
                    value = false
                    break
            }
            //break the loop
            if (rtData.fastForwardTo || (statement.t == 'if')) perform = false
            
            //is this statement a loop
            def loop = (statement.t in ['while', 'repeat', 'for', 'each'])
            if (loop && !value && !!rtData.break) {
            	//someone requested a break from the loop, we're doing it
            	rtData.break = false
                //but we're allowing the rest to continue
                value = true
                perform = false
            }
            //do we repeat the loop?
            repeat = perform && value && loop && !rtData.fastForwardTo
        }
    }
	if (!rtData.fastForwardTo) {
    	def schedule = (statement.t == 'every') ? (rtData.schedules.find{ it.s == statement.$} ?: state.schedules.find{ it.s == statement.$ }) : null
        if (schedule) {
        	//timers need to show the remaining time
    		tracePoint(rtData, "s:${statement.$}", now() - t, now() - schedule.t)
        } else {
    		tracePoint(rtData, "s:${statement.$}", now() - t, value)
        }
    }
	//if (statement.a == '1') {
		//when an async action requests the thread termination, we continue to execute the parent
        //when an async action terminates as a result of a time event, we exit completely
//		value = (rtData.event.name != 'time')
	//}
    if (async) {
    	//if running in async mode, we return true (to continue execution)
    	value = true
    }
    //restore current condition
    rtData.stack.c = c
    if (stacked) {
        rtData.stack.cs.pop()        
    }    
    rtData.stack.s = rtData.stack.ss.pop()
    setSystemVariableValue(rtData, '$index', parentIndex)
    setSystemVariableValue(rtData, '$device', parentDevice)
    rtData.conditionStateChanged = parentConditionStateChanged
	return value || !!rtData.fastForwardTo
}


private Boolean executeAction(rtData, statement, async) {
	def parentDevicesVar = rtData.systemVars['$devices'].v    
	//def devices = []
    //def deviceIds = []
    //if override
    if (!rtData.fastForwardTo && (statement.tsp != 'a')) {
    	cancelStatementSchedules(rtData, statement.$)
    }
    def result = true
    List deviceIds = expandDeviceList(rtData, statement.d)
    List devices = deviceIds.collect{ getDevice(rtData, it) }
    /*
    for (d in statement.d) {
    	if (d.startsWith(':')) {
    		def device = getDevice(rtData, d)
        	if (device) {
	        	devices.push(device)
                deviceIds.push(d)
	        }
        } else {
        	//we're dealing with a variable, let's get the list of devices from it
        	def var = getVariable(rtData, d)
            if (var.t == 'device') {
            	for (vd in var.v) {
                    def device = getDevice(rtData, vd)
                    if (device) {
                        devices.push(device)
                		deviceIds.push(vd)
                    }
                }
            }
        }
    }
    */
    rtData.currentAction = statement
	rtData.systemVars['$devices'].v = deviceIds
    for (task in statement.k) {
        result = executeTask(rtData, devices, statement, task, async)
        if (!result && !rtData.fastForwardTo) {
        	break
        }
    }
    rtData.systemVars['$devices'].v = parentDevicesVar
    return result
}

private Boolean executeTask(rtData, devices, statement, task, async) {
    //parse parameters
   	def virtualDevice = devices.size() ? null : location
    def t = now()
    if (rtData.fastForwardTo) {
	    if (task.$ == rtData.fastForwardTo) {
    		//finally found the resuming point, play nicely from hereon
            tracePoint(rtData, "t:${task.$}", now() - t, null)
    		rtData.fastForwardTo = null
        }
       	//we're not doing anything, we're fast forwarding...        
       	return true
    }
    if (task.m && (task.m instanceof List) && (task.m.size())) {
    	if (!(rtData.locationModeId in task.m)) {
        	debug "Skipping task ${task.$} because of mode restrictions", rtData
        	return true;
        }
    }
    def params = []
    for (param in task.p) {
    	def p
    	switch (param.vt) {
        	case 'variable':
            	p = param.x;
                break;
            default:
            	def v = evaluateOperand(rtData, null, param)
                //if not selected, we want to return null
                p = (v.v != null) ? evaluateExpression(rtData, v, param.vt).v : null
        }
        //ensure value type is successfuly passed through
		params.push p
    }

 	def vcmd = rtData.commands.virtual[task.c]
    long delay = 0
    for (device in (virtualDevice ? [virtualDevice] : devices)) {
        if (!virtualDevice && device.hasCommand(task.c)) {
            def msg = timer "Executed [$device].${task.c}"
        	try {
            	delay = "cmd_${task.c}"(rtData, device, params)
            } catch(all) {
	            executePhysicalCommand(rtData, device, task.c, params)
			}
            trace msg, rtData
        } else {
            if (vcmd) {
	        	delay = executeVirtualCommand(rtData, vcmd.a ? devices : device, task, params)
                //aggregate commands only run once, for all devices at the same time
                if (vcmd.a) break
            }
        }
    }
    //if we don't have to wait, we're home free
    if (delay) {
    	//get remaining piston time
    	def timeLeft = 20000 + rtData.timestamp - now()
        //negative delays force us to reschedule, no sleeping on this one
        boolean reschedule = (delay < 0)
        delay = reschedule ? -delay : delay
    	//we're aiming at waking up with at least 10s left
    	if (reschedule || (timeLeft - delay < 10000) || (delay >= 5000) || async) {
	        //schedule a wake up
	        trace "Requesting a wake up for ${formatLocalTime(now() + delay)} (in ${cast(rtData, delay / 1000, 'decimal')}s)", rtData
            tracePoint(rtData, "t:${task.$}", now() - t, -delay)
            requestWakeUp(rtData, statement, task, delay)
	        return false
	    } else {
	        trace "Waiting for ${delay}ms", rtData
	        pause(delay)
	    }
	}
	tracePoint(rtData, "t:${task.$}", now() - t, delay)
    return true
}

private long executeVirtualCommand(rtData, devices, task, params)
{
	def msg = timer "Executed virtual command ${devices ? (devices instanceof List ? "$devices." : "[$devices].") : ""}${task.c}"
    long delay = 0
    try {
		delay = "vcmd_${task.c}"(rtData, devices, params)
	    trace msg, rtData
    } catch(all) {
    	msg.m = "Error executing virtual command ${devices instanceof List ? "$devices" : "[$devices]"}.${task.c}:"
        msg.e = all
        error msg, rtData
    }
    return delay
}

private executePhysicalCommand(rtData, device, command, params = [], delay = null, scheduleDevice = null) {
	if (!!delay && !!scheduleDevice) {    
    	//we're using schedules instead
        def statement = rtData.currentAction
    	def cs = [] + ((statement.tcp == 'b') || (statement.tcp == 'c') ? (rtData.stack?.cs ?: []) : [])
        def ps = (statement.tcp == 'b') || (statement.tcp == 'p') ? 1 : 0
        cs.removeAll{ it == 0 }
        def schedule = [
            t: now() + delay,
            s: statement.$,
            i: -3,
            cs: cs,
            ps: ps,
            d: [
            	d: scheduleDevice,
                c: command,
                p: params
            ]
        ]
        rtData.schedules.push(schedule)
    } else {
        try {
            params = (params instanceof List) ? params : (params != null ? [params] : [])
            def msg = timer ""
            if (params.size()) {
                if (delay) {            	
                    device."$command"((params as Object[]) + [delay: delay])
                    msg.m = "Executed physical command [${device.label}].$command($params, [delay: $delay])"
                } else {
                    device."$command"(params as Object[])
                    msg.m = "Executed physical command [${device.label}].$command($params)"
                }
            } else {
                if (delay) {
                    device."$command"([delay: delay])
                    msg.m = "Executed physical command [${device.label}].$command([delay: $delay])"
                } else {
                    device."$command"()
                    msg.m = "Executed physical command [${device.label}].$command()"
                }
            }
            debug msg, rtData
        } catch(all) {
            error "Error while executing physical command $device.$command($params):", rtData, null, all
        }
        if (rtData.piston.o?.ced) {
            pause(rtData.piston.o.ced)
            debug "Injected a ${rtData.piston.o.ced}ms delay after [$device].$command(${params ? "$params" : ''})", rtData
        }
    }
}


private scheduleTimer(rtData, timer, long lastRun = 0) {
	//if already scheduled once during this run, don't do it again
    if (rtData.schedules.find{ it.s == timer.$ }) return
	//complicated stuff follows...
    def t = now()
    def interval = "${evaluateOperand(rtData, null, timer.lo).v}"
    if (!interval.isInteger()) return
    interval = interval.toInteger()
    if (interval <= 0) return
    def intervalUnit = timer.lo.vt   

    int level = 0
    switch(intervalUnit) {
        case 'ms': level = 1; break;
        case 's':  level = 2; break;
        case 'm':  level = 3; break;
        case 'h':  level = 4; break;
        case 'd':  level = 5; break;
        case 'w':  level = 6; break;
        case 'n':  level = 7; break;
        case 'y':  level = 8; break;
    }

    long delta = 0
    long time = 0
    switch (intervalUnit) {
    	case 'ms': delta = 1; break;
    	case 's': delta = 1000; break;
    	case 'm': delta = 60000; break;
    	case 'h': delta = 3600000; break;
    }
   
    if (!delta) {
    	//let's get the offset
        time = evaluateOperand(rtData, null, timer.lo2).v
        if (timer.lo2.t != 'c') {
        	def offset = evaluateOperand(rtData, null, timer.lo3)
        	time += (long) evaluateExpression(rtData, [t: 'duration', v: offset.v, vt: offset.vt], 'long').v
        }
        //resulting time is in UTC
        if (!lastRun) {
        	//first run, just adjust the time so we're in the future
            while (time <= now()) {
            	//add days to bring it to next occurrence
            	time += 86400000
            }
        }
    }
    delta = delta * interval
    def priorActivity = !!lastRun
    
    //switch to local date/times
    time = utcToLocalTime(time)
    long rightNow = utcToLocalTime(now())
    lastRun = lastRun ? utcToLocalTime(lastRun) : rightNow
    long nextSchedule = lastRun
    
    if (intervalUnit == 'h') {
    	long min = cast(rtData, timer.lo.om, 'long')
    	nextSchedule = (long) 3600000 * (Math.floor(nextSchedule / 3600000) - 1) + (min * 60000)
    }
    //next date
	int cycles = 100
    while (cycles) {
    	if (delta) {
        	if (nextSchedule < (rightNow - delta)) {
            	//we're behind, let's fast forward to where the next occurrence happens in the future
                def count = Math.floor((rightNow - nextSchedule) / delta)
                //debug "Timer fell behind by $count interval${count > 1 ? 's' : ''}, catching up...", rtData
               	nextSchedule = nextSchedule + delta * count
            }
	    	nextSchedule = nextSchedule + delta
	    } else {
        
            //advance one day if we're in the past
            while (time < rightNow) time += 86400000
            long lastDay = Math.floor(nextSchedule / 86400000)
            long thisDay = Math.floor(time / 86400000)
        
	    	//the repeating interval is not necessarily constant	    
            switch (intervalUnit) {
            	case 'd':
                	if (priorActivity) {
                    	//add the required number of days
                    	nextSchedule = time + 86400000 * (interval - (thisDay - lastDay))
                    } else {
                    	nextSchedule = time
                    }
                    break
            	case 'w':
                	//figure out the first day of the week matching the requirement
					long currentDay = new Date(time).day
	    			long requiredDay = cast(rtData, timer.lo.odw, 'long')
                    if (currentDay > requiredDay) requiredDay += 7
                    //move to first matching day
                    nextSchedule = time + 86400000 * (requiredDay - currentDay)
                    if (nextSchedule < rightNow) {
                    	nextSchedule += 604800000 * interval
                    }
                    break
            	case 'n':
            	case 'y':
                	//figure out the first day of the week matching the requirement
                    int odm = timer.lo.odm.toInteger()
                    def odw = timer.lo.odw
                    def omy = intervalUnit == 'y' ? timer.lo.omy.toInteger() : 0
                    int day = 0
                    def date = new Date(time)
                    int year = date.year
                    int month = (intervalUnit == 'n' ? date.month : omy) + (priorActivity ? interval : ((nextSchedule < rightNow) ? 1 : 0)) * (intervalUnit == 'n' ? 1 : 12)
                    if (month >= 12) {
                        year += Math.floor(month / 12)
                        month = month.mod(12)
                    }
                    date.setDate(1)
                    date.setMonth(month)
                    date.setYear(year)
                    def lastDayOfMonth = (new Date(date.year, date.month + 1, 0)).date
                    if (odw == 'd') {
						if (odm > 0) {
                        	day = (odm <= lastDayOfMonth) ? odm : 0
                        } else {
                        	day = lastDayOfMonth + 1 + odm
                        	day = (day >= 1) ? day : 0
                        }
                    } else {
                    	odw = odw.toInteger()
                    	//find the nth week day of the month
                        if (odm > 0) {
                            //going forward
                            def firstDayOfMonthDOW = (new Date(date.year, date.month, 1)).day
                            //find the first matching day
                            def firstMatch = 1 + odw - firstDayOfMonthDOW + (odw < firstDayOfMonthDOW ? 7 : 0)
                            day = firstMatch + 7 * (odm - 1)
                            day = (result <= lastDayOfMonth) ? day : 0
                        } else {
                            //going backwards
                            def lastDayOfMonthDOW = (new Date(date.year, date.month + 1, 0)).day
                            //find the first matching day
                            def firstMatch = lastDayOfMonth + odw - lastDayOfMonthDOW - (odw > lastDayOfMonthDOW ? 7 : 0)
                            day = firstMatch + 7 * (odm + 1)
                            day = (day >= 1) ? day : 0
                        }
                    }
                    if (day) {
                    	date.setDate(day)
                        nextSchedule = date.time
                    }
					break
            }
    	}
        //check to see if it fits the restrictions
        if (nextSchedule >= rightNow) {
        	long offset = checkTimeRestrictions(rtData, timer.lo, nextSchedule, level, interval)
            if (!offset) break
            if (offset > 0) nextSchedule += offset
        }
        time = nextSchedule
        priorActivity = true
        cycles -= 1
    }
       
    if (nextSchedule > lastRun) {
    	//convert back to UTC
    	nextSchedule = localToUtcTime(nextSchedule)
    	rtData.schedules.removeAll{ it.s == timer.$ }
        requestWakeUp(rtData, timer, [$: -1], nextSchedule)
    }
    
}


private scheduleTimeCondition(rtData, condition) {
	//if already scheduled once during this run, don't do it again
    if (rtData.schedules.find{ (it.s == condition.$) && (it.i == 0) }) return
	def comparison = rtData.comparisons.conditions[condition.co]    
    def trigger = false
    if (!comparison) {
		comparison = rtData.comparisons.triggers[condition.co]
	    if (!comparison) return
    	trigger = true
    }  
    def tv1 = evaluateOperand(rtData, null, condition.to)
    def v1 = evaluateExpression(rtData, evaluateOperand(rtData, null, condition.ro), 'datetime').v + (tv1 ? evaluateExpression(rtData, [t: 'duration', v: tv1.v, vt: tv1.vt], 'long').v : 0)    
    def tv2 = comparison.p > 1 ? evaluateOperand(rtData, null, condition.to) : null
    def v2 = trigger ? v1 : ((comparison.p > 1) ? (evaluateExpression(rtData, evaluateOperand(rtData, null, condition.ro2, null, false, true), 'datetime').v + (tv2 ? evaluateExpression(rtData, [t: 'duration', v: tv2.v, vt: tv2.vt]).v : 0)) : (condition.lo.v == 'time' ? getMidnightTime(rtData) : v1))
    def n = now() + 2000
    if (condition.lo.v == 'time') {
	    while (v1 < n) v1 += 86400000
    	while (v2 < n) v2 += 86400000
/*        int cnt = 100
        error "checking restrictions for $condition.lo", rtData
        while (cnt) {
        	//repeat until we find a day that's matching the restrictions
	    	n = v1 < v2 ? v1 : v2
			if (checkTimeRestrictions(rtData, condition.lo, n, 5, 1) == 0) break
            long n2 = localToUtcTime(utcToLocalTime(n) + 86400000)
            error "adding a day, $n >>> $n2", rtData
            v1 = (v1 == n) ? n2 : v1
            v2 = (v2 == n) ? n2 : v2
            cnt = cnt - 1
        }*/
    }
    //figure out the next time
    v1 = (v1 < n) ? v2 : v1
    v2 = (v2 < n) ? v1 : v2
   	n = v1 < v2 ? v1 : v2
    cancelStatementSchedules(rtData, condition.$)
    if (n > now()) {
    	debug "Requesting time schedule wake up at ${formatLocalTime(n)}", rtData
	    requestWakeUp(rtData, condition, [$:0], n)
    }
}

private Long checkTimeRestrictions(Map rtData, Map operand, long time, int level, int interval) {
	//returns 0 if restrictions are passed
    //returns a positive number as millisecond offset to apply to nextSchedule for fast forwarding
    //returns a negative number as a failed restriction with no fast forwarding offset suggestion
    
	List om = (level <= 2) && (operand.om instanceof List) && operand.om.size() ? operand.om : null;
    List oh = (level <= 3) && (operand.oh instanceof List) && operand.oh.size() ? operand.oh : null;
    List odw = (level <= 5) && (operand.odw instanceof List) && operand.odw.size() ? operand.odw : null;
    List odm = (level <= 6) && (operand.odm instanceof List) && operand.odm.size() ? operand.odm : null;
    List owm = (level <= 6) && !odm && (operand.owm instanceof List) && operand.owm.size() ? operand.owm : null;
    List omy = (level <= 7) && (operand.omy instanceof List) && operand.omy.size() ? operand.omy : null;

	if (!om && !oh && !odw && !odm && !owm && !omy) return 0
	def date = new Date(time)   
    long result = -1
    //month restrictions
    if (omy && (omy.indexOf(date.month + 1) < 0)) {
    	int month = (omy.sort{ it }.find{ it > date.month + 1 } ?: 12 + omy.sort{ it }[0]) - 1
        int year = date.year + (month >= 12 ? 1 : 0)
        month = (month >= 12 ? month - 12 : month)
        def ms = (new Date(year, month, 1)).time - time
    	switch (level) {
        	case 2: //by second
          	    result = interval * (Math.floor(ms / 1000 / interval) - 2) * 1000
                break
        	case 3: //by minute
          	    result = interval * (Math.floor(ms / 60000 / interval) - 2) * 60000
                break
        }
		return (result > 0) ? result : -1
    }

   	//week of month restrictions
    if (owm) {
		if (!((owm.indexOf(getWeekOfMonth(date)) >= 0) || (owm.indexOf(getWeekOfMonth(date, true)) >= 0))) {
            switch (level) {
                case 2: //by second
                result = interval * (Math.floor(((7 - date.day) * 86400 - date.hours * 3600 - date.minutes * 60) / interval) - 2) * 1000
                break
                case 3: //by minute
                result = interval * (Math.floor(((7 - date.day) * 1440 - date.hours * 60 - date.minutes) / interval) - 2) * 60000
                break
            }        
            return (result > 0) ? result : -1
        }
    }
    
   	//day of month restrictions
    if (odm) {
		if (odm.indexOf(date.date) < 0) {
            def lastDayOfMonth = (new Date(date.year, date.month + 1, 0)).date
            if (odm.find{ it < 1 }) {
                //we need to add the last days
                odm = [] + odm //copy the array
                if (odm.indexOf(-1) >= 0) odm.push(lastDayOfMonth)
                if (odm.indexOf(-2) >= 0) odm.push(lastDayOfMonth - 1)
                if (odm.indexOf(-3) >= 0) odm.push(lastDayOfMonth - 2)
                odm.removeAll{ it < 1 }
            }
            switch (level) {
                case 2: //by second
                result = interval * (Math.floor((((odm.sort{ it }.find{ it > date.date } ?: lastDayOfMonth + odm.sort{ it }[0]) - date.date) * 86400 - date.hours * 3600 - date.minutes * 60) / interval) - 2) * 1000
                break
                case 3: //by minute
                result = interval * (Math.floor((((odm.sort{ it }.find{ it > date.date } ?: lastDayOfMonth + odm.sort{ it }[0]) - date.date) * 1440 - date.hours * 60 - date.minutes) / interval) - 2) * 60000
                break
            }        
            return (result > 0) ? result : -1
        }
    }

	//day of week restrictions
    if (odw && (odw.indexOf(date.day) < 0)) {
    	switch (level) {
        	case 2: //by second
          	    result = interval * (Math.floor((((odw.sort{ it }.find{ it > date.day } ?: 7 + odw.sort{ it }[0]) - date.day) * 86400 - date.hours * 3600 - date.minutes * 60) / interval) - 2) * 1000
                break
        	case 3: //by minute
          	    result = interval * (Math.floor((((odw.sort{ it }.find{ it > date.day } ?: 7 + odw.sort{ it }[0]) - date.day) * 1440 - date.hours * 60 - date.minutes) / interval) - 2) * 60000
                break
        }        
		return (result > 0) ? result : -1
    }

    //hour restrictions
    if (oh && (oh.indexOf(date.hours) < 0)) {
    	switch (level) {
        	case 2: //by second
          	    result = interval * (Math.floor((((oh.sort{ it }.find{ it > date.hours } ?: 24 + oh.sort{ it }[0]) - date.hours) * 3600 - date.minutes * 60) / interval) - 2) * 1000
                break
        	case 3: //by minute
          	    result = interval * (Math.floor((((oh.sort{ it }.find{ it > date.hours } ?: 24 + oh.sort{ it }[0]) - date.hours) * 60 - date.minutes) / interval) - 2) * 60000
                break
        }
		return (result > 0) ? result : -1
    }

    //minute restrictions
    if (om && (om.indexOf(date.minutes) < 0)) {
    	//get the next highest minute
        //suggest an offset to reach the next minute
    	result = interval * (Math.floor(((om.sort{ it }.find{ it > date.minutes } ?: 60 + om.sort{ it }[0]) - date.minutes - 1) * 60 / interval) - 2) * 1000
		return (result > 0) ? result : -1
    }
    return 0
}


//return the number of occurrences of same day of week up until the date or from the end of the month if backwards, i.e. last Sunday is -1, second-last Sunday is -2
private int getWeekOfMonth(date = null, backwards = false) {
	def day = date.date
	if (backwards) {
		def month = date.month
		def year = date.year
		def lastDayOfMonth = (new Date(year, month + 1, 0)).date
		return -(1 + Math.floor((lastDayOfMonth - day) / 7))
	} else {
		return 1 + Math.floor((day - 1) / 7) //1 based
	}
}


private requestWakeUp(rtData, statement, task, timeOrDelay, data = null) {
	def time = timeOrDelay > 9999999999 ? timeOrDelay : now() + timeOrDelay
    def cs = [] + ((statement.tcp == 'b') || (statement.tcp == 'c') ? (rtData.stack?.cs ?: []) : [])
    def ps = (statement.tcp == 'b') || (statement.tcp == 'p') ? 1 : 0
    cs.removeAll{ it == 0 }
    def schedule = [
    	t: time,
        s: statement.$,
        i: task?.$,
        cs: cs,
        ps: ps,
        d: data,
        evt: rtData.currentEvent,
        args: rtData.args,
        /*stack: [
        	index: getSystemVariableValue(rtData, '$index'),
        	device: getSystemVariableValue(rtData, '$device'),
        	devices: getSystemVariableValue(rtData, '$devices'),
        ]*/
    ]
    rtData.schedules.push(schedule)
}


private long cmd_setLevel(rtData, device, params) {
	def level = params[0]
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setLevel', level, delay)
    return 0
}

private long cmd_setInfraredLevel(rtData, device, params) {
	def level = params[0]
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setInfraredLevel', level, delay)
    return 0
}

private long cmd_setHue(rtData, device, params) {
	int hue = cast(rtData, params[0] / 3.6, 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setHue', hue, delay)
    return 0
}

private long cmd_setSaturation(rtData, device, params) {
	def saturation = params[0]
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setSaturation', saturation, delay)
    return 0
}

private long cmd_setColorTemperature(rtData, device, params) {
	def colorTemperature = params[0]
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setColorTemperature', colorTemperature, delay)
    return 0
}

private long cmd_setColor(rtData, device, params) {
    def color = (params[0] == 'Random') ? colorUtil.RANDOM : colorUtil.findByName(params[0])
    if (color) {
		color = [
        	hex: color.rgb,
        	hue: color.h,
        	saturation: color.s,
        	level: color.l
    	]
    } else {
    	color = hexToColor(params[0])
        if (color) {
            color = [
                hex: color.hex,
                hue: Math.round(color.hue / 3.6),
                saturation: color.saturation,
                level: color.level
            ]
        }
    }
    if (!color) {
    	error "ERROR: Invalid color $params", rtData
        return 0
    }
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setColor', color, delay)
    return 0
}

private long cmd_setAdjustedColor(rtData, device, params) {
    def color = (params[0] == 'Random') ? colorUtil.RANDOM : colorUtil.findByName(params[0])
    if (color) {
		color = [
        	hex: color.rgb,
        	hue: color.h,
        	saturation: color.s,
        	level: color.l
    	]
    } else {
    	color = hexToColor(params[0])
        if (color) {
            color = [
                hex: color.hex,
                hue: Math.round(color.hue / 3.6),
                saturation: color.saturation,
                level: color.level
            ]
        }
    }
    if (!color) {
    	error "ERROR: Invalid color $params", rtData
        return 0
    }
    def duration = cast(rtData, params[1], 'long')
    def state = params.size() > 2 ? params[2] : ""
    def delay = params.size() > 3 ? params[3] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setAdjustedColor', [color, duration], delay)
    return 0
}

private long cmd_setAdjustedHSLColor(rtData, device, params) {
    def hue = cast(rtData, params[0] / 3.6, 'integer')
    def saturation = params[1]
    def level = params[2]
    def color = [
        hue: hue,
        saturation: saturation,
        level: level
    ]
    def duration = cast(rtData, params[3], 'long')
    def state = params.size() > 4 ? params[4] : ""
    def delay = params.size() > 5 ? params[5] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setAdjustedColor', [color, duration], delay)
    return 0
}

private long cmd_setLoopDuration(rtData, device, params) {
    int duration = (int) Math.round(cast(rtData, params[0], 'long') / 1000)
    executePhysicalCommand(rtData, device, 'setLoopDuration', duration, delay)
    return 0
}

private long cmd_setVideoLength(rtData, device, params) {
    int duration = (int) Math.round(cast(rtData, params[0], 'long') / 1000)
    executePhysicalCommand(rtData, device, 'setVideoLength', duration, delay)
    return 0
}


private long vcmd_log(rtData, device, params) {
	def command = params[0]
	def message = params[1]
	log message, rtData, null, null, "${command}".toLowerCase().trim(), true
    def save = params.size() > 2 ? !!params[2] : false
	if (save) {
		sendNotificationEvent(message)
	}
    return 0
}

private long vcmd_setState(rtData, device, params) {
	def value = params[0]
    if (rtData.piston.o?.mps) {
    	rtData.state.new = value
    	rtData.pistonStateChanged = rtData.pistonStateChanged || (rtData.state.old != rtData.state.new)
        setSystemVariableValue(rtData, '$state', rtData.state.new)        
    } else {
	    error "Cannot set the piston state while in automatic mode. Please edit the piston settings to disable the automatic piston state if you want to manually control the state.", rtData
    }
    return 0
}

private long vcmd_setLocationMode(rtData, device, params) {
	def modeIdOrName = params[0]
    def mode = location.getModes()?.find{ (hashId(it.id) == modeIdOrName) || (it.name == modeIdOrName)}
    if (mode) {
    	location.setMode(mode.name)
    } else {
	    error "Error setting location mode. Mode '$modeIdOrName' does not exist.", rtData
    }
    return 0
}

private long vcmd_setAlarmSystemStatus(rtData, device, params) {
	def statusIdOrName = params[0]
    def status = rtData.virtualDevices['alarmSystemStatus']?.o?.find{ (it.key == statusIdOrName) || (it.value == statusIdOrName)}.collect{ [id: it.key, name: it.value] }
    if (status && status.size()) {
	    sendLocationEvent(name: 'alarmSystemStatus', value: status[0].id)
    } else {
	    error "Error setting SmartThings Home Monitor status. Status '$statusIdOrName' does not exist.", rtData
    }
    return 0
}

private long vcmd_sendEmail(rtData, device, params) {
	def data = [
    	i: hashId(app.id),
        n: app.label,
        t: params[0],
        s: params[1],
        m: params[2]
    ]

	def requestParams = [
		uri:  "https://api.webcore.co/email/send/${rtData.locationId}",
		query: null,
		requestContentType: "application/json",
		body: data
	]
    def success = false
	httpPost(requestParams) { response ->
    	if (response.status == 200) {
			def jsonData = response.data instanceof Map ? response.data : new groovy.json.JsonSlurper().parseText(response.data)
            if (jsonData && (jsonData.result == 'OK')) {
            	success = true
            }
        }
	}
    if (!success) {
	    error "Error sending email to ${data.t}", rtData
    }
    return 0
}

private long vcmd_noop(rtData, device, params) {
	return 0
}

private long vcmd_wait(rtData, device, params) {
	return cast(rtData, params[0], 'long')
}

private long vcmd_waitRandom(rtData, device, params) {
	def min = params[0]
    def max = params[1]
    if (max < min) {
    	def v = max
        max = min
        min = v
    }
	return min + (int)Math.round((max - min) * Math.random())
}

private long vcmd_waitForTime(rtData, device, params) {
	long time = now()
    time = cast(rtData, params[0], 'time')
    long rightNow = now()
    while (time < rightNow) time += 86400000
    return time - rightNow
}

private long vcmd_waitForDateTime(rtData, device, params) {
	long time = cast(rtData, params[0], 'datetime')
    long rightNow = now()
    return (time > rightNow) ? time - rightNow : 0
}

private long vcmd_toggle(rtData, device, params) {
	if (getDeviceAttributeValue(rtData, device, 'switch') == 'off') {
	    executePhysicalCommand(rtData, device, 'on')
    } else {
	    executePhysicalCommand(rtData, device, 'off')
    }
    return 0
}

private long vcmd_toggleLevel(rtData, device, params) {
	def level = params[0]
	if (getDeviceAttributeValue(rtData, device, 'level') == level) {
	    executePhysicalCommand(rtData, device, 'setLevel', 0)
    } else {
	    executePhysicalCommand(rtData, device, 'setLevel', level)
    }
    return 0
}

private long vcmd_adjustLevel(rtData, device, params) {
	int level = cast(rtData, params[0], 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    level = level + cast(rtData, getDeviceAttributeValue(rtData, device, 'level'), 'integer')
    level = (level < 0) ? 0 : ((level > 100) ? 100 : level)
    executePhysicalCommand(rtData, device, 'setLevel', level, delay)
    return 0
}

private long vcmd_adjustInfraredLevel(rtData, device, params) {
	int infraredLevel = cast(rtData, params[0], 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    infraredLevel = infraredLevel + cast(rtData, getDeviceAttributeValue(rtData, device, 'infraredLevel'), 'integer')
    infraredLevel = (infraredLevel < 0) ? 0 : ((infraredLevel > 100) ? 100 : infraredLevel)
    executePhysicalCommand(rtData, device, 'setInfraredLevel', infraredLevel, delay)
    return 0
}

private long vcmd_adjustSaturation(rtData, device, params) {
	int saturation = cast(rtData, params[0], 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    saturation = saturation + cast(rtData, getDeviceAttributeValue(rtData, device, 'saturation'), 'integer')
    saturation = (saturation < 0) ? 0 : ((saturation > 100) ? 100 : saturation)
    executePhysicalCommand(rtData, device, 'setSaturation', saturation, delay)
    return 0
}

private long vcmd_adjustHue(rtData, device, params) {
	int hue = cast(rtData, params[0] / 3.6, 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    hue = hue + cast(rtData, getDeviceAttributeValue(rtData, device, 'hue'), 'integer')
    hue = (hue < 0) ? 0 : ((hue > 100) ? 100 : hue)
    executePhysicalCommand(rtData, device, 'setHue', hue, delay)
    return 0
}

private long vcmd_adjustColorTemperature(rtData, device, params) {
	int colorTemperature = cast(rtData, params[0], 'integer')
    def state = params.size() > 1 ? params[1] : ""
    def delay = params.size() > 2 ? params[2] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    colorTemperature = colorTemperature + cast(rtData, getDeviceAttributeValue(rtData, device, 'colorTemperature'), 'integer')
    colorTemperature = (colorTemperature < 1000) ? 1000 : ((colorTemperature > 30000) ? 30000 : colorTemperature)
    executePhysicalCommand(rtData, device, 'setColorTemperature', colorTemperature, delay)
    return 0
}

private long vcmd_fadeLevel(rtData, device, params) {
	int startLevel = (params[0] != null) ? cast(rtData, params[0], 'integer') : cast(rtData, getDeviceAttributeValue(rtData, device, 'level'), 'integer')
    int endLevel = cast(rtData, params[1], 'integer')
    long duration = cast(rtData, params[2], 'long')
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    startLevel = (startLevel < 0) ? 0 : ((startLevel > 100) ? 100 : startLevel)
    endLevel = (endLevel < 0) ? 0 : ((endLevel > 100) ? 100 : endLevel)
    return vcmd_internal_fade(rtData, device, 'setLevel', startLevel, endLevel, duration)
}

private long vcmd_fadeInfraredLevel(rtData, device, params) {
	int startLevel = (params[0] != null) ? cast(rtData, params[0], 'integer') : cast(rtData, getDeviceAttributeValue(rtData, device, 'infraredLevel'), 'integer')
    int endLevel = cast(rtData, params[1], 'integer')
    long duration = cast(rtData, params[2], 'long')
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    startLevel = (startLevel < 0) ? 0 : ((startLevel > 100) ? 100 : startLevel)
    endLevel = (endLevel < 0) ? 0 : ((endLevel > 100) ? 100 : endLevel)
    return vcmd_internal_fade(rtData, device, 'setInfraredLevel', startLevel, endLevel, duration)
}

private long vcmd_fadeSaturation(rtData, device, params) {
	int startLevel = (params[0] != null) ? cast(rtData, params[0], 'integer') : cast(rtData, getDeviceAttributeValue(rtData, device, 'saturation'), 'integer')
    int endLevel = cast(rtData, params[1], 'integer')
    long duration = cast(rtData, params[2], 'long')
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    startLevel = (startLevel < 0) ? 0 : ((startLevel > 100) ? 100 : startLevel)
    endLevel = (endLevel < 0) ? 0 : ((endLevel > 100) ? 100 : endLevel)
    return vcmd_internal_fade(rtData, device, 'setSaturation', startLevel, endLevel, duration)
}

private long vcmd_fadeHue(rtData, device, params) {
	int startLevel = (params[0] != null) ? cast(rtData, params[0] / 3.6, 'integer') : cast(rtData, getDeviceAttributeValue(rtData, device, 'hue'), 'integer')
    int endLevel = cast(rtData, params[1], 'integer')
    long duration = cast(rtData, params[2], 'long')
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    startLevel = (startLevel < 0) ? 0 : ((startLevel > 100) ? 100 : startLevel)
    endLevel = (endLevel < 0) ? 0 : ((endLevel > 100) ? 100 : endLevel)
    return vcmd_internal_fade(rtData, device, 'setHue', startLevel, endLevel, duration)
}

private long vcmd_fadeColorTemperature(rtData, device, params) {
	int startLevel = (params[0] != null) ? cast(rtData, params[0], 'integer') : cast(rtData, getDeviceAttributeValue(rtData, device, 'colorTemperature'), 'integer')
    int endLevel = cast(rtData, params[1], 'integer')
    long duration = cast(rtData, params[2], 'long')
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    startLevel = (startLevel < 0) ? 0 : ((startLevel > 100) ? 100 : startLevel)
    endLevel = (endLevel < 0) ? 0 : ((endLevel > 100) ? 100 : endLevel)
    return vcmd_internal_fade(rtData, device, 'setColorTemperature', startLevel, endLevel, duration)
}

private long vcmd_internal_fade(Map rtData, device, String command, int startLevel, int endLevel, long duration) {
    long minInterval = 5000
    if (duration <= 5000) {
    	minInterval = 500
    } else if (duration <= 10000) {
    	minInterval = 1000    
	} else if (duration <= 30000) {
		minInterval = 3000
	} else {
		minInterval = 5000
    }
    if ((startLevel == endLevel) || (duration <= 500)) {
    	//if the fade is too fast, or not changing anything, give it up and go to the end level directly
    	executePhysicalCommand(rtData, device, command, endLevel)
        return 0
    }
	int delta = endLevel - startLevel
    //the max number of steps we can do
    int steps = delta > 0 ? delta : -delta
    //figure out the interval
    long interval = Math.round(duration / steps)
    if (interval < minInterval) {
    	//intervals too small, adjust to do one change per 500ms
    	steps = Math.floor(1.0 * duration / minInterval)
        interval = Math.round(1.0 * duration / steps)
    }
    def scheduleDevice = (duration > 10000) ? hashId(device.id) : null
    int oldLevel = startLevel
	executePhysicalCommand(rtData, device, command, startLevel)
    for(def i = 1; i <= steps; i++) {
        int newLevel = Math.round(startLevel + delta * i / steps)
        if (oldLevel != newLevel) {
           	executePhysicalCommand(rtData, device, command, newLevel, i * interval, scheduleDevice)
        }
        oldLevel = newLevel
    }
    //for good measure, send a last command 100ms after the end of the interval
    executePhysicalCommand(rtData, device, command, endLevel, duration + 99, scheduleDevice)
    return duration + 100
}

private long vcmd_flash(rtData, device, params) {
	error "Sorry, flash is not yet implemented", rtData
	return 0
}

private long vcmd_sendNotification(rtData, device, params) {
	def message = params[0]
    sendNotificationEvent(message)
    return 0
}

private long vcmd_sendPushNotification(rtData, device, params) {
	def message = params[0]
    def save = !!params[1]
	if (save) {
		sendPush(message)
	} else {
		sendPushMessage(message)
	}
    return 0
}

private long vcmd_sendSMSNotification(rtData, device, params) {
	def message = params[0]
	def phones = "${params[1]}".replace(" ", "").replace("-", "").replace("(", "").replace(")", "").tokenize(",;*|").unique()
	def save = !!params[2]
	for(def phone in phones) {
		if (save) {
			sendSms(phone, message)
		} else {
			sendSmsMessage(phone, message)
		}
		//we only need one notification
		save = false
	}
    return 0
}

private long vcmd_sendNotificationToContacts(rtData, device, params) {
	def message = params[0]
    List contacts = (params[1] instanceof List ? params[1] : params[1].toString().tokenize(',')).unique();
	List recipients = rtData.contacts.findAll{ it.key in contacts }.collect{ it.value }
    if (recipients.size()) {
        if (recipients && recipients.size()) {
			def save = !!params[2]
			sendNotificationToContacts(message, recipients, [event: save])
        }
	} else {
    	error "Invalid list of contacts: ${params[1]}", rtData
    }
    return 0
}

private long vcmd_setVariable(rtData, device, params) {
	def name = params[0]
    def value = params[1]
	setVariable(rtData, name, value)    
    return 0
}

private long vcmd_executePiston(rtData, device, params) {
	def selfId = hashId(app.id)
	def pistonId = params[0]
    def arguments = (params[1] instanceof List ? params[1] : params[1].toString().tokenize(',')).unique();
    def description = "webCoRE: Piston $app.label requested execution of piston $pistonId"
    Map data = [:]
    for (argument in arguments) {
    	data[argument] = getVariable(rtData, argument).v
    }
    sendLocationEvent(name: pistonId, value: selfId, isStateChange: true, displayed: false, linkText: description, descriptionText: description, data: data)
    return 0
}

private long vcmd_pausePiston(rtData, device, params) {
	def selfId = hashId(app.id)
	def pistonId = params[0]
    parent.pausePiston(pistonId)
    return 0
}

private long vcmd_resumePiston(rtData, device, params) {
	def selfId = hashId(app.id)
	def pistonId = params[0]
    parent.resumePiston(pistonId)
    return 0
}

private long vcmd_executeRoutine(rtData, device, params) {
	def routineId = params[0]
    def routine = location.helloHome?.getPhrases().find{ hashId(it.id) == routineId }
    if (routine) {
	    location.helloHome?.execute(routine.label)
    }
    return 0
}

private long vcmd_setHSLColor(rtData, device, params) {
    def hue = cast(rtData, params[0] / 3.6, 'integer')
    def saturation = params[1]
    def level = params[2]
    def color = [
        hue: hue,
        saturation: saturation,
        level: level
    ]
    def state = params.size() > 3 ? params[3] : ""
    def delay = params.size() > 4 ? params[4] : 0
    if (state && (getDeviceAttributeValue(rtData, device, 'switch') != "$state")) {
        return 0
    }
    executePhysicalCommand(rtData, device, 'setColor', color, delay)
    return 0
}



private long vcmd_wolRequest(rtData, device, params) {
	def mac = params[0]
	def secureCode = params[1]
	mac = mac.replace(":", "").replace("-", "").replace(".", "").replace(" ", "").toLowerCase()
	sendHubCommand(new physicalgraph.device.HubAction(
		"wake on lan $mac",
		physicalgraph.device.Protocol.LAN,
		null,
		secureCode ? [secureCode: secureCode] : [:]
	))
    return 0
}

private long vcmd_httpRequest(rtData, device, params) {
	def uri = params[0].replace(" ", "%20")
	def method = params[1]
	def contentType = params[2]
	def variables = params[3]
    if (!uri) return false
	def protocol = "https"
	def uriParts = uri.split("://").toList()
	if (uriParts.size() > 2) {
		warn "Invalid URI for web request: $uri", rtData
		return false
	}
	if (uriParts.size() == 2) {
		//remove the httpX:// from the uri
		protocol = uriParts[0].toLowerCase()
		uri = uriParts[1]
	}
	def internal = uri.startsWith("10.") || uri.startsWith("192.168.")
	if ((!internal) && uri.startsWith("172.")) {
		//check for the 172.16.x.x/12 class
		def b = uri.substring(4,2)
		if (b.isInteger()) {
			b = b.toInteger()
			internal = (b >= 16) && (b <= 31)
		}
	}
	def data = [:]
	for(variable in variables) {
		data[variable] = getVariable(rtData, variable).v
	}
	if (internal) {
		try {
			debug "Sending internal web request to: $uri", rtData
			sendHubCommand(new physicalgraph.device.HubAction(
				method: method,
				path: (uri.indexOf("/") > 0) ? uri.substring(uri.indexOf("/")) : "",
				headers: [
					HOST: (uri.indexOf("/") > 0) ? uri.substring(0, uri.indexOf("/")) : uri,
				],
				query: method == "GET" ? data : null, //thank you @destructure00
				body: method != "GET" ? data : null //thank you @destructure00    
			))
		} catch (all) {
			error "Error executing internal web request: ", rtData, null, all
		}
	} else {
		try {
			debug "Sending external web request to: $uri", rtData
			def requestParams = [
				uri:  "${protocol}://${uri}",
				query: method == "GET" ? data : null,
				requestContentType: (method != "GET") && (contentType == "JSON") ? "application/json" : "application/x-www-form-urlencoded",
				body: method != "GET" ? data : null
			]
			def func = ""
			switch(method) {
				case "GET":
					func = "httpGet"
					break
				case "POST":
					func = "httpPost"
					break
				case "PUT":
					func = "httpPut"
					break
				case "DELETE":
					func = "httpDelete"
					break
				case "HEAD":
					func = "httpHead"
					break
			}
			if (func) {
				"$func"(requestParams) { response ->
					setSystemVariableValue(rtData, "\$httpStatusCode", response.status)
					setSystemVariableValue(rtData, "\$httpStatusOk", response.status == 200)
					/*if (importData && (response.status == 200) && response.data) {
						try {
							def jsonData = response.data instanceof Map ? response.data : new groovy.json.JsonSlurper().parseText(response.data)
							importVariables(jsonData, importPrefix)
						} catch (all) {
							debug "Error parsing JSON response for web request: $all", null, "error"
						}
					}*/
				}
			}
		} catch (all) {
			error "Error executing external web request: ", rtData, null, all
		}
	}
	return 0
}










private Boolean evaluateConditions(rtData, conditions, collection, async) {
	def t = now()
    def msg = timer ''
    //override condition id
    def c = rtData.stack.c    
    rtData.stack.c = conditions.$
    def not = (collection == 'c') ? !!conditions.n : !!conditions.rn
    def grouping = (collection == 'c') ? conditions.o : conditions.rop
    def value = (grouping == 'or' ? false : true)
	for(condition in conditions[collection]) {
    	def res = evaluateCondition(rtData, condition, collection, async)
        value = (grouping == 'or') ? value || res : value && res
        //conditions optimizations go here
        if (!rtData.fastForwardTo && (!rtData.piston.o?.cto) && (value == (grouping == 'or') ? true : false)) break
    }
    def result = not ? !value : !!value
    if (!rtData.fastForwardTo) tracePoint(rtData, "c:${conditions.$}", now() - t, result)
    def oldResult = !!rtData.cache["c:${conditions.$}"];
    rtData.conditionStateChanged = (oldResult != result)
    if (rtData.conditionStateChanged) {
    	//condition change, perform TCP
        cancelConditionSchedules(rtData, conditions.$)
    }
    rtData.cache["c:${conditions.$}"] = result
    //true/false actions
    if (collection == 'c') {
	    if ((result || rtData.fastForwardTo) && conditions.ts && conditions.ts.length) executeStatements(rtData, conditions.ts, async) 
    	if ((!result || rtData.fastForwardTo) && conditions.fs && conditions.fs.length) executeStatements(rtData, conditions.fs, async)
    }
    //restore condition id
    rtData.stack.c = c
    if (!rtData.fastForwardTo) {
    	msg.m = "Condition group #${conditions.$} evaluated $result (${rtData.conditionStateChanged ? 'changed' : 'did not change'})"
    	debug msg, rtData
    }
	return result
}

private evaluateOperand(rtData, node, operand, index = null, trigger = false, nextMidnight = false) {
	def values = []
    //older pistons don't have the 'to' operand (time offset), we're simulating an empty one
    if (!operand) operand = [t: 'c']
    switch (operand.t) {
    	case '': //optional, nothing selected
        	values = [[i: "${node?.$}:$index:0", v: [t: operand.vt, v: null]]]
            break
        case "p": //physical device
        	def j = 0;
        	for(deviceId in expandDeviceList(rtData, operand.d)) {
            	def value = [i: "${deviceId}:${operand.a}", v:getDeviceAttribute(rtData, deviceId, operand.a, operand.i, trigger) + (operand.vt ? [vt: operand.vt] : [:])]
                updateCache(rtData, value)
	            values.push(value)
	            j++
			}
	        if ((values.size() > 1) && !(operand.g in ['any', 'all'])) {
	            //if we have multiple values and a grouping other than any or all we need to apply that function
	            try {
	                values = [[i: "${node?.$}:$index:0", v:"func_${operand.g}"(rtData, values*.v) + (operand.vt ? [vt: operand.vt] : [:])]]
	            } catch(all) {
	                error "Error applying grouping method ${operand.g}", rtData
	            }
	        }
	        break;
		case 'd': //devices
        	def deviceIds = []
            for (d in expandDeviceList(rtData, operand.d)) {
				if (getDevice(rtData, d)) deviceIds.push(d)
            }
            /*
            for (d in rtData, operand.d) {
                if (d.startsWith(':')) {
                    if (getDevice(rtData, d)) deviceIds.push(d)
                } else {
                    //we're dealing with a variable, let's get the list of devices from it
                    def var = getVariable(rtData, d)
                    if (var.t == 'device') {
                        for (vd in var.v) {
							if (getDevice(rtData, vd)) deviceIds.push(vd)
                    	}
                	}
            	}
            }    
            */
			values = [[i: "${node?.$}:d", v:[t: 'device', v: deviceIds.unique()]]]	
            break
		case 'v': //virtual devices
        	switch (operand.v) {
            	case 'mode':
            	case 'alarmSystemStatus':
                	values = [[i: "${node?.$}:v", v:getDeviceAttribute(rtData, rtData.locationId, operand.v)]];
                    break;
				case 'time':
				case 'date':
				case 'datetime':
                	values = [[i: "${node?.$}:v", v:[t: operand.v, v: cast(rtData, now(), operand.v)]]];
                    break;
				case 'routine':
                	values = [[i: "${node?.$}:v", v:[t: 'string', v: (rtData.event.name == 'routineExecuted' ? hashId(rtData.event.value) : null)]]];
                    break;
				case 'ifttt':
                	values = [[i: "${node?.$}:v", v:[t: 'string', v: (rtData.event.name == 'ifttt' ?rtData.event.value : null)]]];
                    break;
				case 'askAlexa':
                	values = [[i: "${node?.$}:v", v:[t: 'string', v: (rtData.event.name == 'askAlexaMacro' ? hashId(rtData.event.value) : null)]]];
                    break;
				case 'echoSistant':                
                	values = [[i: "${node?.$}:v", v:[t: 'string', v: (rtData.event.name == 'echoSistantProfile' ? hashId(rtData.event.value) : null)]]];
                    break;
            }
            break
        case "s": //preset
        	switch (operand.vt) {
        		case 'time':
                case 'datetime':
                    def v = 0;
                    switch (operand.s) {
                        case 'midnight': v = nextMidnight ? getNextMidnightTime(rtData) : getMidnightTime(rtData); break;
                        case 'sunrise': v = getSunriseTime(rtData); break;
                        case 'noon': v = getNoonTime(rtData); break;
                        case 'sunset': v = getSunsetTime(rtData); break;
                    }
                    values = [[i: "${node?.$}:$index:0", v:[t:operand.vt, v:v]]]
					break
				default:
					values = [[i: "${node?.$}:$index:0", v:[t:operand.vt, v:operand.s]]]           
					break	
			}
            break
        case "x": //variable
        	if ((operand.vt == 'device') && (operand.x instanceof List)) {
            	//we could have multiple devices selected
                def sum = []
                for (x in operand.x) {               
                	def var = getVariable(rtData, x)
                    if (var.v instanceof List) {
                    	sum += var.v
                    } else {
                    	sum.push(var.v)
                    }
                    values = [[i: "${node?.$}:$index:0", v:[t: 'device', v: sum] + (operand.vt ? [vt: operand.vt] : [:])]]
                }
            } else {
	        	values = [[i: "${node?.$}:$index:0", v:getVariable(rtData, operand.x) + (operand.vt ? [vt: operand.vt] : [:])]]
            }
            break
        case "c": //constant
        	switch (operand.vt) {
            	case 'time':
                    def offset = cast(rtData, operand.c, 'integer')
                    def v = localDate().clearTime()
                    v.set(hourOfDay: (int) Math.floor(offset / 60), minute: (int) offset.mod(60))
                    values = [[i: "${node?.$}:$index:0", v: [t: 'time', v:localToUtcTime(v)]]]
                    break
            	case 'date':
            	case 'datetime':
                    values = [[i: "${node?.$}:$index:0", v: [t: operand.vt, v:operand.c]]]
                    break
            }
            if (values.size()) break
        case "e": //expression
	        values = [[i: "${node?.$}:$index:0", v: [:] + evaluateExpression(rtData, operand.exp) + (operand.vt ? [vt: operand.vt] : [:])]]
            break
        case "u": //expression
	        values = [[i: "${node?.$}:$index:0", v: getArgument(rtData, operand.u)]]
            break
    }
    if (!node) {
    	if (values.length) return values[0].v
        return [t: 'dynamic', v: null]
    }
    return values
}

private evaluateScalarOperand(rtData, node, operand, index = null, dataType = 'string') {
	def value = evaluateOperand(rtData, null, operand, index)
    return [t: dataType, v: cast(rtData, (value ? value.v: ''), dataType)]
}

private Boolean evaluateCondition(rtData, condition, collection, async) {
	def t = now()
    def msg = timer ''
    //override condition id
    def c = rtData.stack.c    
    rtData.stack.c = condition.$
    def not = false
    def result = false
    if (condition.t == 'group') {
    	return evaluateConditions(rtData, condition, collection, async)
    } else {
        not = !!condition.n
        def comparison = rtData.comparisons.triggers[condition.co]
        def trigger = !!comparison
        if (!comparison) comparison = rtData.comparisons.conditions[condition.co]
        rtData.wakingUp = (rtData.event.name == 'time') && (!!rtData.event.schedule) && (rtData.event.schedule.s == condition.$)
        if (rtData.fastForwardTo || comparison) {
            if (!rtData.fastForwardTo) {
                def paramCount = comparison.p ?: 0
                def lo = null
                def ro = null
                def ro2 = null
                for(int i = 0; i <= paramCount; i++) {
                    def operand = (i == 0 ? condition.lo : (i == 1 ? condition.ro : condition.ro2))
                    //parse the operand
                    def values = evaluateOperand(rtData, condition, operand, i, trigger)                    
                    switch (i) {
                        case 0:
                        lo = [operand: operand, values: values]
                        break
                        case 1:
                        ro = [operand: operand, values: values]
                        break
                        case 2:
                        ro2 = [operand: operand, values: values]
                        break
                    }
                }

                //we now have all the operands, their values, and the comparison, let's get to work
                Map options = [
                	//we ask for matching/non-matching devices if the user requested it or if the trigger is timed
                    //setting matches to true will force the condition group to evaluate all members (disables evaluation optimizations)
					matches: lo.operand.dm || lo.operand.dn || (trigger && comparison.t),
                    forceAll: (trigger && comparison.t)
				]
                def to = (comparison.t || (ro && (lo.operand.t == 'v') && (lo.operand.v == 'time') && (ro.operand.t != 'c'))) && condition.to ? [operand: condition.to, values: evaluateOperand(rtData, null, condition.to)] : null
                def to2 = ro2 && (lo.operand.t == 'v') && (lo.operand.v == 'time') && (ro2.operand.t != 'c') && condition.to2 ? [operand: condition.to2, values: evaluateOperand(rtData, null, condition.to2)] : null
                result = evaluateComparison(rtData, condition.co, lo, ro, ro2, to, to2, options)
                //save new values to cache
                if (lo) for (value in lo.values) updateCache(rtData, value)
                if (ro) for (value in ro.values) updateCache(rtData, value)
                if (ro2) for (value in ro2.values) updateCache(rtData, value)
                if (!rtData.fastForwardTo) tracePoint(rtData, "c:${condition.$}", now() - t, result)
                if (lo.operand.dm && options.devices) setVariable(rtData, lo.operand.dm, options.devices?.matched ?: [])
                if (lo.operand.dn && options.devices) setVariable(rtData, lo.operand.dn, options.devices?.unmatched ?: [])
                //do the stay logic here
                if (trigger && comparison.t) {
                	//timed trigger
                    if (to) {
                        def tvalue = to && to.operand && to.values ? to.values + [f: to.operand.f] : null
                        if (tvalue) {
	                        long delay = evaluateExpression(rtData, [t: 'duration', v: tvalue.v, vt: tvalue.vt], 'long').v
                            if ((lo.operand.t == 'p') && (lo.operand.g == 'any') && lo.values.size() > 1) {
                            	def schedules = atomicState.schedules
                            	for (value in lo.values) {
                                	def dev = value.v?.d
                                    if (dev in options.devices.matched) {
                                    	//schedule one device schedule
                                        if (!schedules.find{ (it.s == condition.$) && (it.d == dev)  }) {
                                        	//schedule a wake up if there's none, otherwise just move on
                                            debug "Adding a timed trigger schedule for device $dev for condition ${condition.$}", rtData
			                            	requestWakeUp(rtData, condition, condition, delay, dev)
                                        }
                                    } else {
                                    	//cancel that one device schedule
                                        debug "Cancelling any timed trigger schedules for device $dev for condition ${condition.$}", rtData
                                		cancelStatementSchedules(rtData, condition.$, dev)
                                    }
                                }
                            } else {
                            	if (result) {
                                	//if we find the comparison true, set a timer if we haven't already
									if (!schedules.find{ (it.s == condition.$) }) {
                                		debug "Adding a timed trigger schedule for condition ${condition.$}", rtData
		                            	requestWakeUp(rtData, condition, condition, delay)
                                    }
                                } else {
                                	debug "Cancelling any timed trigger schedules for condition ${condition.$}", rtData
                                	cancelStatementSchedules(rtData, condition.$)
                                }
                            }
                        }
                    }
                    result = false
                }
                result = not ? !result : !!result
            } else if ((rtData.event.name == 'time') && (rtData.fastForwardTo == condition.$)) {
            	rtData.fastForwardTo = null
				result = not ? false : true
        	} else {
                result = true
            }
        }
    }
    rtData.wakingUp = false
    def oldResult = !!rtData.cache["c:${condition.$}"];
    rtData.conditionStateChanged = oldResult != result
    if (rtData.conditionStateChanged) {
    	//condition change, perform TCP
        cancelConditionSchedules(rtData, condition.$)
    }
    rtData.cache["c:${condition.$}"] = result
    //true/false actions
    if ((result || rtData.fastForwardTo) && condition.ts && condition.ts.length) executeStatements(rtData, condition.ts, async)
	if ((!result || rtData.fastForwardTo) && condition.fs && condition.fs.length) executeStatements(rtData, condition.fs, async)
    //restore condition id
    rtData.stack.c = c
    if (!rtData.fastForwardTo) {
	    msg.m = "Condition #${condition.$} evaluated $result"
	    debug msg, rtData
    }
    if ((rtData.fastForwardTo <= 0) && condition.s && (condition.t == 'condition') && condition.lo && condition.lo.t == 'v') {
    	switch (condition.lo.v) {
        	case 'time':
            case 'date':
            case 'datetime':
	            scheduleTimeCondition(rtData, condition);
            	break;
        }
    }
    return result
}

private updateCache(rtData, value) {
    def oldValue = rtData.cache[value.i]
    if (!oldValue || (oldValue.t != value.v.t) || (oldValue.v != value.v.v)) {
        //debug "Updating value", rtData
        rtData.newCache[value.i] = value.v + [s: now()]
    } else {
        //debug "Not updating value", rtData
    }
}

private Boolean evaluateComparison(rtData, comparison, lo, ro = null, ro2 = null, to = null, to2 = null, options = [:]) {
		def fn = "comp_${comparison}"
        def result = (lo.operand.g == 'any' ? false : true)
        if (options?.matches) {
        	options.devices = [matched: [], unmatched: []]
        }
        //if multiple left values, go through each
        def tvalue = to && to.operand && to.values ? to.values + [f: to.operand.f] : null 
        def tvalue2 = to2 && to2.operand && to2.values ? to2.values : null
        for(value in lo.values) {
            def res = false
            if (value && value.v && (!value.v.x || options.forceAll)) {
                try {
                    if (!ro) {
                    	def msg = timer ""
                        res = "$fn"(rtData, value, null, null, tvalue, tvalue2)
                    	msg.m = "Comparison ${value?.v?.v} $comparison = $res"
                        debug msg, rtData
                    } else {
                        def rres
                        res = (ro.operand.g == 'any' ? false : true)
                        //if multiple right values, go through each
                        for (rvalue in ro.values) {
                            if (!ro2) {
                                def msg = timer ""
                                rres = "$fn"(rtData, value, rvalue, null, tvalue, tvalue2)
                                msg.m = "Comparison ${value?.v?.v} $comparison ${rvalue?.v?.v} = $rres"
                                debug msg, rtData                                
                            } else {
                                rres = (ro2.operand.g == 'any' ? false : true)
                                //if multiple right2 values, go through each
                                for (r2value in ro2.values) {
                                	def msg = timer ""
                                    def r2res = "$fn"(rtData, value, rvalue, r2value, tvalue, tvalue2)
                                    msg.m = "Comparison ${value?.v?.v} $comparison ${rvalue?.v?.v} .. ${r2value?.v?.v} = $r2res"
                                    debug msg, rtData
                                    rres = (ro2.operand.g == 'any' ? rres || r2res : rres && r2res)
                                    if (((ro2.operand.g == 'any') && rres) || ((ro2.operand.g != 'any') && !rres)) break
                                }
                            }
                            res = (ro.operand.g == 'any' ? res || rres : res && rres)
                            if (((ro.operand.g == 'any') && res) || ((ro.operand.g != 'any') && !res)) break
                        }
                    }
                } catch(all) {
                    error "Error calling comparison $fn:", rtData, null, all
                    res = false
                }
                if (lo.operand.t == 'v') {
                	switch (lo.operand.v) {
                    	case 'time':
                        case 'date':
                        case 'datetime':
                        	if (checkTimeRestrictions(rtData, lo.operand, now(), 5, 1)) res = false;
                    }
                }
            }
            result = (lo.operand.g == 'any' ? result || res : result && res)
            if (options?.matches && value.v.d) {
            	if (res) {
                	options.devices.matched.push(value.v.d)
                } else {
                	options.devices.unmatched.push(value.v.d)
                }
            }
            if ((lo.operand.g == 'any') && res && !(options?.matches)) {
            	//logical OR if we're using the ANY keyword
            	break;
            }
            if ((lo.operand.g == 'all') && !result && !(options?.matches)) {
            	//logical AND if we're using the ALL keyword
            	break;
            }
        }
        return result
}

private cancelStatementSchedules(rtData, statementId, data = null) {
	//cancel all schedules that are pending for statement statementId
    if (!(statementId in rtData.cancelations.statements)) {
    	rtData.cancelations.statements.push([id: statementId, data: data])
    }
}

private cancelConditionSchedules(rtData, conditionId) {
	//cancel all schedules that are pending for condition conditionId
    if (!(conditionId in rtData.cancelations.conditions)) {
    	rtData.cancelations.conditions.push(conditionId)
    }
}

private Boolean matchDeviceSubIndex(list, deviceSubIndex) {
	if (!list || !(list instanceof List)) return true
    return list.collect{ "$it".toString() }.indexOf("$deviceSubIndex".toString()) >= 0
}

private List listPreviousStates(device, attribute, threshold, excludeLast) {
	def result = []
	if (!(device instanceof physicalgraph.app.DeviceWrapper)) return result
	def events = device.events([all: true, max: 100]).findAll{it.name == attribute}
	//if we got any events, let's go through them
	//if we need to exclude last event, we start at the second event, as the first one is the event that triggered this function. The attribute's value has to be different from the current one to qualify for quiet
	def thresholdTime = now() - threshold
	def endTime = now()
	for(def i = 0; i < events.size(); i++) {
		def startTime = events[i].date.getTime()
		def duration = endTime - startTime
		if ((duration >= 1000) && ((i > 0) || !excludeLast)) {
			result.push([value: events[i].value, startTime: startTime, duration: duration])
		}
		if (startTime < thresholdTime)
			break
		endTime = startTime
	}
	return result
}

private Map valueCacheChanged(rtData, comparisonValue) {
	def oldValue = rtData.cache[comparisonValue.i]
    def newValue = comparisonValue.v
    if (!(oldValue instanceof Map)) oldValue = false
    return (!!oldValue && ((oldValue.t != newValue.t) || ("${oldValue.v}" != "${newValue.v}"))) ? [i: comparisonValue.i, v: oldValue] : null
}

private boolean valueWas(rtData, comparisonValue, rightValue, rightValue2, timeValue, func) {
	if (!comparisonValue || !comparisonValue.v || !comparisonValue.v.d || !comparisonValue.v.a || !timeValue || !timeValue.v || !timeValue.vt) {
    	return false
    }
    def device = getDevice(rtData, comparisonValue.v.d)
    if (!device) return false
    def attribute = comparisonValue.v.a
    long threshold = evaluateExpression(rtData, [t: 'duration', v: timeValue.v, vt: timeValue.vt], 'long').v
    
	def states = listPreviousStates(device, attribute, threshold, (rtData.event.device.id == device.id) && (rtData.event.name == attribute))
    def result = true
    long duration = 0
    for (state in states) {
    	if (!("comp_$func"(rtData, [i: comparisonValue.i, v: [t: comparisonValue.v.t, v: state.value]], rightValue, rightValue2, timeValue))) break
        duration += state.duration
    }
    if (!duration) return false
    return (timeValue.f == 'l') ? duration < threshold : duration >= threshold
}

private boolean valueChanged(rtData, comparisonValue, timeValue) {
	if (!comparisonValue || !comparisonValue.v || !comparisonValue.v.d || !comparisonValue.v.a || !timeValue || !timeValue.v || !timeValue.vt) {
    	return false
    }
    def device = getDevice(rtData, comparisonValue.v.d)
    if (!device) return false
    def attribute = comparisonValue.v.a
    long threshold = evaluateExpression(rtData, [t: 'duration', v: timeValue.v, vt: timeValue.vt], 'long').v
    
	def states = listPreviousStates(device, attribute, threshold, false)
    if (!states.size()) return false
    def value = states[0].value
    for (state in states) {
    	if (state.value != value) return true
    }
    return false
}

//comparison low level functions
private boolean comp_is								(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return (evaluateExpression(rtData, lv.v, 'string').v == evaluateExpression(rtData, rv.v, 'string').v) || (lv.v.n && (cast(rtData, lv.v.n, 'string') == cast(rtData, rv.v.v, 'string'))) }
private boolean comp_is_not							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_is(rtData, lv, rv, rv2, tv, tv2) }
private boolean comp_is_equal_to					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v == evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_not_equal_to				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v != evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_different_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v != evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_less_than					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v < evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_less_than_or_equal_to		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v <= evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_greater_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v > evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_greater_than_or_equal_to	(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'decimal').v >= evaluateExpression(rtData, rv.v, 'decimal').v }
private boolean comp_is_even						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'integer').v.mod(2) == 0 }
private boolean comp_is_odd							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return evaluateExpression(rtData, lv.v, 'integer').v.mod(2) != 0 }
private boolean comp_is_true						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !!evaluateExpression(rtData, lv.v, 'boolean').v }
private boolean comp_is_false						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !evaluateExpression(rtData, lv.v, 'boolean').v }
private boolean comp_is_inside_of_range				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def v = evaluateExpression(rtData, lv.v, 'decimal').v; def v1 = evaluateExpression(rtData, rv.v, 'decimal').v; def v2 = evaluateExpression(rtData, rv2.v, 'decimal').v; return (v1 < v2) ? ((v >= v1) && (v <= v2)) : ((v >= v2) && (v <= v1)); }
private boolean comp_is_outside_of_range			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_is_inside_of_range(rtData, lv, rv, rv2, tv, tv2) }
private boolean comp_is_any_of						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def v = evaluateExpression(rtData, lv.v, 'string').v; for (vi in rv.v.v.tokenize(',')) { if (v == evaluateExpression(rtData, [t: rv.v.t, v: "$vi".toString().trim(), i: rv.v.i, a: rv.v.a, vt: rv.v.vt], 'string').v) return true; }; return false;}
private boolean comp_is_not_any_of					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_is_any_of(rtData, lv, rv, rv2, tv, tv2); }

private boolean comp_was							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is'); }
private boolean comp_was_not						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_not'); }
private boolean comp_was_equal_to					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_equal_to'); }
private boolean comp_was_not_equal_to				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_not_equal_to'); }
private boolean comp_was_different_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_different_than'); }
private boolean comp_was_less_than					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_less_than'); }
private boolean comp_was_less_than_or_equal_to		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_less_than_or_equal_to'); }
private boolean comp_was_greater_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_greater_than'); }
private boolean comp_was_greater_than_or_equal_to	(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_greater_than_or_equal_to'); }
private boolean comp_was_even						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_even'); }
private boolean comp_was_odd						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_odd'); }
private boolean comp_was_true						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_true'); }
private boolean comp_was_false						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_false'); }
private boolean comp_was_inside_of_range			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_inside_of_range'); }
private boolean comp_was_outside_of_range			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_outside_of_range'); }
private boolean comp_was_any_of						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_any_of'); }
private boolean comp_was_not_any_of					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueWas(rtData, lv, rv, rv2, tv, 'is_not_any_of'); }

private boolean comp_changed						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueChanged(rtData, lv, tv); }
private boolean comp_did_not_change					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !valueChanged(rtData, lv, tv); }

private boolean comp_is_any							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return true; }
private boolean comp_is_before						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { long offset1 = tv ? evaluateExpression(rtData, [t: 'duration', v: tv.v, vt: tv.vt], 'long').v : 0; return evaluateExpression(rtData, lv.v, 'datetime').v + 2000 < (evaluateExpression(rtData, rv.v, 'datetime').v + offset1); }
private boolean comp_is_after						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { long offset1 = tv ? evaluateExpression(rtData, [t: 'duration', v: tv.v, vt: tv.vt], 'long').v : 0; return evaluateExpression(rtData, lv.v, 'datetime').v + 2000 >= (evaluateExpression(rtData, rv.v, 'datetime').v + offset1); }
private boolean comp_is_between						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { long offset1 = tv ? evaluateExpression(rtData, [t: 'duration', v: tv.v, vt: tv.vt], 'long').v : 0; long offset2 = tv2 ? evaluateExpression(rtData, [t: 'duration', v: tv2.v, vt: tv2.vt], 'long').v : 0; long v = evaluateExpression(rtData, lv.v, 'datetime').v + 2000; long v1 = evaluateExpression(rtData, rv.v, 'datetime').v + offset1; long v2 = evaluateExpression(rtData, rv2.v, 'datetime').v + offset2; return (v1 < v2) ? (v >= v1) && (v < v2) : (v < v2) || (v >= v1); }
private boolean comp_is_not_between					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_is_between(rtData, lv, rv, rv2, tv, tv2); }

/*triggers*/
private boolean comp_gets							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return (cast(rtData, lv.v.v, 'string') == cast(rtData, rv.v.v, 'string')) && matchDeviceSubIndex(lv.v.i, rtData.currentEvent.index)}
private boolean comp_executes						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is(rtData, lv, rv, rv2, tv, tv2) }
private boolean comp_happens_daily_at				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return rtData.wakingUp }

private boolean comp_changes						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueCacheChanged(rtData, lv); }
private boolean comp_changes_to						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return valueCacheChanged(rtData, lv) && ("${lv.v.v}" == "${rv.v.v}"); }
private boolean comp_changes_away_from				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && ("${oldValue.v.v}" == "${rv.v.v}"); }
private boolean comp_drops							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') > cast(rtData, lv.v.v, 'decimal')); }
private boolean comp_does_not_drop					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_drops(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_drops_below					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') >= cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') < cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_drops_to_or_below				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') > cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') <= cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_rises							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') < cast(rtData, lv.v.v, 'decimal')); }
private boolean comp_does_not_rise					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !comp_rises(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_rises_above					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') <= cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') > cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_rises_to_or_above				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') < cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') >= cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_remains_below					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') < cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') < cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_remains_below_or_equal_to		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') <= cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') <= cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_remains_above					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') > cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') > cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_remains_above_or_equal_to		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'decimal') >= cast(rtData, rv.v.v, 'decimal')) && (cast(rtData, lv.v.v, 'decimal') >= cast(rtData, rv.v.v, 'decimal')); }
private boolean comp_enters_range					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); if (!oldValue) return false; def ov = cast(rtData, oldValue.v.v, 'decimal'); def v = cast(rtData, lv.v.v, 'decimal'); def v1 = cast(rtData, rv.v.v, 'decimal'); def v2 = cast(rtData, rv2.v.v, 'decimal'); if (v1 > v2) { def vv = v1; v1 = v2; v2 = vv; }; return ((ov < v1) || (ov > v2)) && ((v >= v1) && (v <= v2)); }
private boolean comp_exits_range					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); if (!oldValue) return false; def ov = cast(rtData, oldValue.v.v, 'decimal'); def v = cast(rtData, lv.v.v, 'decimal'); def v1 = cast(rtData, rv.v.v, 'decimal'); def v2 = cast(rtData, rv2.v.v, 'decimal'); if (v1 > v2) { def vv = v1; v1 = v2; v2 = vv; }; return ((ov >= v1) && (ov <= v2)) && ((v < v1) || (v > v2)); }
private boolean comp_remains_inside_of_range		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); if (!oldValue) return false; def ov = cast(rtData, oldValue.v.v, 'decimal'); def v = cast(rtData, lv.v.v, 'decimal'); def v1 = cast(rtData, rv.v.v, 'decimal'); def v2 = cast(rtData, rv2.v.v, 'decimal'); if (v1 > v2) { def vv = v1; v1 = v2; v2 = vv; }; return (ov >= v1) && (ov <= v2) && (v >= v1) && (v <= v2); }
private boolean comp_remains_outside_of_range		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); if (!oldValue) return false; def ov = cast(rtData, oldValue.v.v, 'decimal'); def v = cast(rtData, lv.v.v, 'decimal'); def v1 = cast(rtData, rv.v.v, 'decimal'); def v2 = cast(rtData, rv2.v.v, 'decimal'); if (v1 > v2) { def vv = v1; v1 = v2; v2 = vv; }; return ((ov < v1) || (ov > v2)) && ((v < v1) || (v > v2)); }
private boolean comp_becomes_even					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'integer').mod(2) != 0) && (cast(rtData, lv.v.v, 'integer').mod(2) == 0); }
private boolean comp_becomes_odd					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'integer').mod(2) == 0) && (cast(rtData, lv.v.v, 'integer').mod(2) != 0); }
private boolean comp_remains_even					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'integer').mod(2) == 0) && (cast(rtData, lv.v.v, 'integer').mod(2) == 0); }
private boolean comp_remains_odd					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return oldValue && (cast(rtData, oldValue.v.v, 'integer').mod(2) != 0) && (cast(rtData, lv.v.v, 'integer').mod(2) != 0); }

private boolean comp_changes_to_any_of				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return !!valueCacheChanged(rtData, lv) && comp_is_any_of(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_changes_away_from_any_of		(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { def oldValue = valueCacheChanged(rtData, lv); return !!oldValue && comp_is_any_of(rtData, oldValue, rv, rv2); }

private boolean comp_stays							(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_unchanged				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return true; }
private boolean comp_stays_not						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_not(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_equal_to					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_equal_to(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_not_equal_to				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_not_equal_to(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_different_than			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_different_than(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_less_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_less_than(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_less_than_or_equal_to	(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_less_than_or_equal_to(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_greater_than				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_greater_than(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_greater_than_or_equal_to	(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_greater_than_or_equal_to(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_even						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_even(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_odd						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_odd(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_true						(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_true(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_false					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_false(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_inside_of_range			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_inside_of_range(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_outside_of_range			(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_outside_of_range(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_any_of					(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_any_of(rtData, lv, rv, rv2, tv, tv2); }
private boolean comp_stays_not_any_of				(rtData, lv, rv = null, rv2 = null, tv = null, tv2 = null) { return comp_is_not_any_of(rtData, lv, rv, rv2, tv, tv2); }


private traverseStatements(node, closure, parentNode = null, data = null) {
    if (!node) return
	//if a statements element, go through each item
	if (node instanceof List) {
    	for(item in node) {
        	if (!item.di) {
	           	boolean lastTimer = (data && data.timer)
    	        if (data && (item.t == 'every')) {
        	        data.timer = true
            	}
	    		traverseStatements(item, closure, parentNode, data)
            	if (data) {
                	data.timer = lastTimer
            	}
            }
	    }
        return
	}   
    
    //got a statement, pass it on to the closure
    if (closure instanceof Closure) {
    	closure(node, parentNode, data)
    }
    
    //if the statements has substatements, go through them
    if (node.s instanceof List) {
    	traverseStatements(node.s, closure, node, data)
    }
    if (node.e instanceof List) {
    	traverseStatements(node.e, closure, node, data)
    }
}

private traverseEvents(node, closure, parentNode = null) {
    if (!node) return
	//if a statements element, go through each item
	if (node instanceof List) {
    	for(item in node) {
	    	traverseEvents(item, closure, parentNode)
	    }
        return
	}
    //got a condition, pass it on to the closure
    if ((closure instanceof Closure)) {
    	closure(node, parentNode)
    }
}

private traverseConditions(node, closure, parentNode = null) {
    if (!node) return
	//if a statements element, go through each item
	if (node instanceof List) {
    	for(item in node) {
	    	traverseConditions(item, closure, parentNode)
	    }
        return
	}
    //got a condition, pass it on to the closure
    if ((node.t == 'condition') && (closure instanceof Closure)) {
    	closure(node, parentNode)
    }
    //if the statements has substatements, go through them
    if (node.c instanceof List) {
    	if (closure instanceof Closure) closure(node, parentNode)
    	traverseConditions(node.c, closure, node)
    }
}

private traverseRestrictions(node, closure, parentNode = null) {
    if (!node) return
	//if a statements element, go through each item
	if (node instanceof List) {
    	for(item in node) {
	    	traverseRestrictions(item, closure, parentNode)
	    }
        return
	}
    //got a restriction, pass it on to the closure
    if ((node.t == 'restriction') && (closure instanceof Closure)) {
    	closure(node, parentNode)
    }
    //if the statements has substatements, go through them
    if (node.r instanceof List) {
    	if (closure instanceof Closure) closure(node, parentNode)
    	traverseRestrictions(node.r, closure, node)
    }
}
private traverseExpressions(node, closure, param, parentNode = null) {
    if (!node) return
	//if a statements element, go through each item
	if (node instanceof List) {
    	for(item in node) {
	    	traverseExpressions(item, closure, param, parentNode)
	    }
        return
	}
    //got a statement, pass it on to the closure
    if (closure instanceof Closure) {
    	closure(node, parentNode, param)
    }
    //if the statements has substatements, go through them
    if (node.i instanceof List) {
    	traverseExpressions(node.i, closure, param, node)
    }
}

private getRoutineById(routineId) {
	def routines = location.helloHome?.getPhrases()
    for(routine in routines) {
    	if (routine && routine?.label && (hashId(routine.id) == routineId)) {
    		return routine
        }
    }
    return null
}


private void subscribeAll(rtData) {
	try {
        rtData = rtData ?: getRunTimeData()
        def ss = [
            events: 0,
            controls: 0,
            devices: 0,
        ]
        def statementData = [timer: false]
        def msg = timer "Finished subscribing", null, -1
        unsubscribe()
        trace "Subscribing to devices...", rtData, 1
        Map devices = [:]
        Map subscriptions = [:]
        def count = 0
        def hasTriggers = false
        def downgradeTriggers = false
        //traverse all statements
        //def statementTraverser
        //def expressionTraverser
        //def operandTraverser
        def expressionTraverser = { expression, parentExpression, comparisonType -> 
        	def subscriptionId = null
            def deviceId = null
            def attribute = null
            if ((expression.t == 'device') && (expression.id)) {
                devices[expression.id] = [c: (comparisonType ? 1 : 0) + (devices[expression.id]?.c ?: 0)]
                subscriptionId = "${expression.id}${expression.a}"
                deviceId = expression.id
                attribute = expression.a
            }
            if ((expression.t == 'variable') && expression.x && expression.x.startsWith('@')) {
                subscriptionId = "${expression.x}"
                deviceId = rtData.locationId
                attribute = "${handle()}.${expression.x}"
            }
            if (subscriptionId && deviceId) {
                def ct = subscriptions[subscriptionId]?.t ?: null
                if ((ct == 'trigger') || (comparisonType == 'trigger')) {
                    ct = 'trigger'                       
                } else {
                    ct = ct ?: comparisonType
                }
                subscriptions[subscriptionId] = [d: deviceId, a: attribute, t: ct, c: (subscriptions[subscriptionId] ? subscriptions[subscriptionId].c : []) + [condition]]
            }
        }    
        def operandTraverser = { node, operand, value, comparisonType ->
        	if (!operand) return
            switch (operand.t) {	
                case "p": //physical device
                    for(deviceId in expandDeviceList(rtData, operand.d, true)) {
                        devices[deviceId] = [c: (comparisonType ? 1 : 0) + (devices[deviceId]?.c ?: 0)]
                        //if we have any trigger, it takes precedence over anything else
                        def ct = subscriptions["$deviceId${operand.a}"]?.t ?: null
                        if ((ct == 'trigger') || (comparisonType == 'trigger')) {
                            ct = 'trigger'                       
                        } else {
                            ct = ct ?: comparisonType
                        }
                        subscriptions["$deviceId${operand.a}"] = [d: deviceId, a: operand.a, t: ct , c: (subscriptions["$deviceId${operand.a}"] ? subscriptions["$deviceId${operand.a}"].c : []) + (comparisonType?[node]:[])]
                    }
                    break;
                case "v": //physical device
                    def deviceId = rtData.locationId
                    //if we have any trigger, it takes precedence over anything else
                    devices[deviceId] = [c: (comparisonType ? 1 : 0) + (devices[deviceId]?.c ?: 0)]
                    def subscriptionId = null
                    def attribute = null
                    switch (operand.v) {
						case 'time':
                        case 'date':
                        case 'datetime':
                        case 'mode':
                        case 'alarmSystemStatus':
                       		subscriptionId = "$deviceId${operand.v}"
                           	attribute = operand.v
                            break
                        case 'routine':
                        	if (value && (value.t == 'c') && (value.c)) {
                            	def routine = getRoutineById(value.c)
                                if (routine) {
	                        		subscriptionId = "$deviceId${operand.v}${routine.id}"
    	                        	attribute = "routineExecuted.${routine.id}"
                                }
                            }
                            break
                        case 'ifttt':
                        case 'askAlexa':
                        case 'echoSistant':
                        	if (value && (value.t == 'c') && (value.c)) {
                            	def options = rtData.virtualDevices[operand.v]?.o
                            	def item = options ? options[value.c] : value.c
                                if (item) {
	                        		subscriptionId = "$deviceId${operand.v}${item}"
                                	attribute = "${operand.v}.${item}"
                                    switch (operand.v) {
                                    	case 'askAlexa':
                                        	attribute = "askAlexaMacro.${item}"
                                            break;
                                    	case 'echoSistant':
                                        	attribute = "echoSistantProfile.${item}"
                                            break;
                                    }
                                }
                            }
                            break
                    }
                    if (subscriptionId) {
                    	def ct = subscriptions[subscriptionId]?.t ?: null
                        if ((ct == 'trigger') || (comparisonType == 'trigger')) {
                            ct = 'trigger'                       
                        } else {
                            ct = ct ?: comparisonType
                        }
                        subscriptions[subscriptionId] = [d: deviceId, a: attribute, t: ct , c: (subscriptions[subscriptionId] ? subscriptions[subscriptionId].c : []) + (comparisonType?[node]:[])]
                        break;
                    }
					break;
                case 'x':
                	if (operand.x && operand.x.startsWith('@')) {
                    	def subscriptionId = operand.x
                        def attribute = "${handle()}.${operand.x}"
                        def ct = subscriptions[subscriptionId]?.t ?: null
                        if ((ct == 'trigger') || (comparisonType == 'trigger')) {
                            ct = 'trigger'                       
                        } else {
                            ct = ct ?: comparisonType
                        }
                        subscriptions[subscriptionId] = [d: rtData.locationId, a: attribute, t: ct , c: (subscriptions[subscriptionId] ? subscriptions[subscriptionId].c : []) + (comparisonType?[node]:[])]
                    }
                	break;
                case "c": //constant
                case "e": //expression
                    traverseExpressions(operand.exp?.i, expressionTraverser, comparisonType)
                    break
            }
        }
        def eventTraverser = { event, parentEvent ->
            if (event.lo) {
				def comparisonType = 'trigger'
                operandTraverser(event, event.lo, null, comparisonType)
            }
        }
        def conditionTraverser = { condition, parentCondition ->
            if (condition.co) {
                def comparison = rtData.comparisons.conditions[condition.co]
                def comparisonType = 'condition'
                if (!comparison) {
                    hasTriggers = true
                    comparisonType = downgradeTriggers || (condition.sm == 'never') ? 'condition' : 'trigger'
                    comparison = rtData.comparisons.triggers[condition.co]                	
                }
                if (comparison) {
                    condition.ct = comparisonType.take(1)
                    def paramCount = comparison.p ?: 0
                    for(int i = 0; i <= paramCount; i++) {
                        //get the operand to parse
                        def operand = (i == 0 ? condition.lo : (i == 1 ? condition.ro : condition.ro2))
                        operandTraverser(condition, operand, condition.ro, comparisonType)
                    }
                }
            }
            if (condition.ts instanceof List) traverseStatements(condition.ts, statementTraverser, condition, statementData)
            if (condition.fs instanceof List) traverseStatements(condition.fs, statementTraverser, condition, statementData)
        }
        def restrictionTraverser = { restriction, parentRestriction ->
            if (restriction.co) {
                def comparison = rtData.comparisons.conditions[restriction.co]
                def comparisonType = 'condition'
                if (!comparison) {
                    //hasTriggers = true
                    //comparisonType = downgradeTriggers ? 'condition' : 'trigger'
                    comparison = rtData.comparisons.triggers[restriction.co]                	
                }
                if (comparison) {
                    def paramCount = comparison.p ?: 0
                    for(int i = 0; i <= paramCount; i++) {
                        //get the operand to parse
                        def operand = (i == 0 ? restriction.lo : (i == 1 ? restriction.ro : restriction.ro2))
                        operandTraverser(restriction, operand, null, null)
                    }
                }
            }
        }    
        def statementTraverser = { node, parentNode, data ->
        	downgradeTriggers = data && data.timer
            if (node.r) traverseRestrictions(node.r, restrictionTraverser)
            for(deviceId in node.d) {
                devices[deviceId] = devices[deviceId] ?: [c: 0]
            }
            switch( node.t ) {
            	case 'if':
                	if (node.ei) traverseStatements(node.ei*.s, statementTraverser, node, data)
                case 'while':
                case 'repeat':
                	traverseConditions((node.c?:[]) + (node.ei?node.ei*.c:[]), conditionTraverser)
                    break;
                case 'on':
                	traverseEvents(node.c?:[], eventTraverser)
                    break
            	case 'switch':
                	operandTraverser(node, node.lo, null, 'condition')
                	for (c in node.cs) {
	                    operandTraverser(c, c.ro, null, null)
	                    //if case is a range, traverse the second operand too
	                    if (c.t == 'r') operandTraverser(c, c.ro2, null, null)
	                    if (c.s instanceof List) {
	                        traverseStatements(c.s, statementTraverser, node, data)
	                    }
	                }
					break;
				case 'every':
                	hasTriggers = true;
                    break;
            }
        }
        if (rtData.piston.r) traverseRestrictions(rtData.piston.r, restrictionTraverser)
        if (rtData.piston.s) traverseStatements(rtData.piston.s, statementTraverser, null, statementData)
        //device variables
        for(variable in rtData.piston.v.findAll{ it.t == 'device' }) {
            for (deviceId in variable.v) {
                devices[deviceId] = [c: 0 + (devices[deviceId]?.c ?: 0)]
            }
        }
        def dds = [:]
        for (subscription in subscriptions) {
        	def altSub = 'never';
            for (condition in subscription.value.c) if (condition) {
            	condition.s = false
                altSub = (condition.sm == 'always') ? condition.sm : ((altSub != 'always') && (condition.sm != 'never') ? condition.sm : altSub)
			}
            if (!rtData.piston.o.des && !!subscription.value.t && !!subscription.value.c && (altSub != "never") && ((subscription.value.t == "trigger") || (altSub == "always") || !hasTriggers)) {
                def device = getDevice(rtData, subscription.value.d)
                if (device) {
					for (condition in subscription.value.c) if (condition) { condition.s = (condition.sm != 'never') && ((condition.ct == 't') || (condition.sm == 'always') || (!hasTriggers)) }
                	switch (subscription.value.a) {
                    	case 'time':
                        case 'date':
                        case 'datetime':
                        	break;
						default:
                            info "Subscribing to $device.${subscription.value.a}...", rtData
                            subscribe(device, subscription.value.a, deviceHandler)
                            ss.events = ss.events + 1
                            if (!dds[device.id]) {
                                ss.devices = ss.devices + 1
                                dds[device.id] = 1
                            }
                    }
                } else {
                    error "Failed subscribing to $device.${subscription.value.a}, device not found", rtData
                }
            } else {
				for (condition in subscription.value.c) if (condition) { condition.s = false }
                if (devices[subscription.value.d]) {
	                devices[subscription.value.d].c = devices[subscription.value.d].c - 1
                }
            }
        }
        //fake subscriptions for controlled devices to force the piston being displayed in those devices' Smart Apps tabs
        for (d in devices.findAll{ ((it.value.c <= 0) || (rtData.piston.o.des)) && (it.key != rtData.locationId) }) {
            def device = getDevice(rtData, d.key)
            if (device && (device != location)) {
                trace "Subscribing to $device...", rtData
                subscribe(device, "", fakeHandler)
                ss.controls = ss.controls + 1
                if (!dds[device.id]) {
                    ss.devices = ss.devices + 1
                    dds[device.id] = 1
                }
            }
        }
        state.subscriptions = ss
        trace msg, rtData


        def event = [date: new Date(), device: location, name: 'time', value: now(), schedule: [t: 0, s: 0, i: -9]]
        executeEvent(rtData, event)
		processSchedules rtData, true
        subscribe(app, appHandler)
        subscribe(location, hashId(app.id), executeHandler)
    } catch (all) {
    	error "An error has occurred while subscribing: ", rtData, null, all
    }
}


private List expandDeviceList(rtData, List devices, localVarsOnly = false) {
	List result = []
	for(deviceId in devices) {
    	if (deviceId && (deviceId.size() == 34) && deviceId.startsWith(':') && deviceId.endsWith(':')) {
        	result.push(deviceId)
        } else {
        	if (localVarsOnly) {
            	//during subscriptions we use local vars only to make sure we don't subscribe to "variable" lists of devices
	        	def var = rtData.localVars[deviceId]
    	        if (var && (var.t == 'device') && (var.v instanceof Map) && (var.v.t == 'd') && (var.v.d instanceof List) && var.v.d.size()) result += var.v.d
            } else {
	        	def var = getVariable(rtData, deviceId)
    	        if (var && (var.t == 'device') && (var.v instanceof List) && var.v.size()) result += var.v
            }
        }
    }
    return result.unique()
}

def appHandler(evt) {
    log.debug "app event ${evt.name}:${evt.value} received"
}


private sanitizeVariableName(name) {
	name = name ? "$name".trim().replace(" ", "_") : null
}

private getDevice(rtData, idOrName) {
	if (rtData.locationId == idOrName) return location
	def device = rtData.devices[idOrName] ?: rtData.devices.find{ it.value.name == idOrName }
    return device    
}

private getDeviceAttributeValue(rtData, device, attributeName) {
	if (rtData.event && (rtData.event.name == attributeName) && (rtData.event.device.id == device.id)) {
    	return rtData.event.value;
    } else {
		return device.currentValue(attributeName)
    }
}

private Map getDeviceAttribute(rtData, deviceId, attributeName, subDeviceIndex = null, trigger = false) {
	if (deviceId == rtData.locationId) {
    	//we have the location here
        switch (attributeName) {
        	case 'mode': 
            	def mode = location.getCurrentMode();
            	return [t: 'string', v: hashId(mode.getId()), n: mode.getName()]
        	case 'alarmSystemStatus': 
				def v = location.currentState("alarmSystemStatus")?.value
                def n = rtData.virtualDevices['alarmSystemStatus']?.o[v]
				return [t: 'string', v: v, n: n]
        }
        return [t: 'string', v: location.getName().toString()]
    }
	def device = getDevice(rtData, deviceId)
    if (device) {
        def attribute = rtData.attributes[attributeName ?: '']
        if (!attribute) {
            attribute = [t: 'string', m: false]
        }
        //x = eXclude - if a momentary attribute is looked for and the device does not match the current device, then we must ignore this during comparisons
        def value = (attributeName ? cast(rtData, getDeviceAttributeValue(rtData, device, attributeName), attribute.t) : "$device")
        if (attributeName == 'hue') {
        	value = cast(rtData, cast(rtData, value, 'decimal') * 3.6, attribute.t)
        }
		return [t: attribute.t, v: value, d: deviceId, a: attributeName, i: subDeviceIndex, x: (!!attribute.m || !!trigger) && ((device?.id != (rtData.event.device?:location).id) || (attributeName != rtData.event.name))]
    }
    return [t: "error", v: "Device '${deviceId}' not found"]
}

private Map getArgument(rtData, name) {
	List parts = name.tokenize('.');
    def args = [:] + rtData.args
    for(part in parts) {
    	if (!(args instanceof Map)) return [t: 'dynamic', v: '']
        args = args[part]
    }
    return [t: 'dynamic', v: "$args".toString()]
}

private Map getVariable(rtData, name) {
	name = sanitizeVariableName(name)
	if (!name) return [t: "error", v: "Invalid empty variable name"]
    def result
	if (name.startsWith("@")) {
    	result = rtData.globalVars[name]
        if (!(result instanceof Map)) result = [t: "error", v: "Variable '$name' not found"]
	} else {
		if (name.startsWith('$')) {
        	if (name.startsWith('$args.') && (name.size() > 6)) {
            	result = getArgument(rtData, name.substring(6))
            } else {
				result = rtData.systemVars[name]
            	if (!(result instanceof Map)) result = [t: "error", v: "Variable '$name' not found"]
            	if (result && result.d) {
	            	result = [t: result.t, v: getSystemVariableValue(rtData, name)]
	            }
            }
		} else {
			result = rtData.localVars[name]
            if (!(result instanceof Map)) result = [t: "error", v: "Variable '$name' not found"]
		}
	}
    if (result && (result.t == 'dev55ice')) {
	   	def deviceIds = []
        def devices = []
        for(deviceId in ((result.v instanceof List) ? result.v : [result.v])) {
            deviceIds.push(deviceId)
        }
	    result = [t: result.t, v: deviceIds]
    } else if (result.v instanceof Map) {
    	//we're dealing with an operand, let's parse it
        result = evaluateExpression(rtData, evaluateOperand(rtData, null, result.v), result.t)
    }
    return [t: result.t, v: result.v]
}

private Map setVariable(rtData, name, value) {
	name = sanitizeVariableName(name)
	if (!name) return [t: "error", v: "Invalid empty variable name"]
	if (name.startsWith("@")) {
    	def variable = rtData.globalVars[name]
    	if (variable instanceof Map) {
        	//set global var
            variable.v = cast(rtData, value, variable.t)
            Map cache = rtData.gvCache ?: [:]
            cache[name] = variable
            rtData.gvCache = cache
            return variable
        }
	} else {
		def variable = rtData.localVars[name]
        if (variable instanceof Map) {
            //set value
            variable.v = cast(rtData, value, variable.t)
            if (!variable.f) {
            	def vars = state.vars
                vars[name] = variable.v
                state.vars = vars
                atomicState.vars = vars
            }
            return variable
            
		}
	}
   	result = [t: 'error', v: 'Invalid variable']
}


/******************************************************************************/
/*** 																		***/
/*** EXPRESSION FUNCTIONS													***/
/*** 																		***/
/******************************************************************************/

def Map proxyEvaluateExpression(rtData, expression, dataType = null) {
	resetRandomValues()
	return evaluateExpression(getRunTimeData(rtData), expression, dataType)
}
private Map simplifyExpression(expression) {
	while ((expression.t == 'expression') && expression.i && (expression.i.size() == 1)) expression = expression.i[0]
    return expression
}

private Map evaluateExpression(rtData, expression, dataType = null) {
    //if dealing with an expression that has multiple items, let's evaluate each item one by one
    //let's evaluate this expression
    if (!expression) return [t: 'error', v: 'Null expression']
    //not sure what it was needed for - need to comment more
    //if (expression && expression.v instanceof Map) return evaluateExpression(rtData, expression.v, expression.t)
    expression = simplifyExpression(expression)
    def time = now()
    def result = expression
    switch (expression.t) {
        case "string":
        case "integer":
        case "int32":
        case "int64":
        case "long":
        case "decimal":
        case "boolean":
        case "time":
        case "date":
        case "datetime":
        	result = [t: expression.t, v: cast(rtData, expression.v, expression.t)]
        	break
        case "enum":
        case "error":
        case "phone":
        case "uri":
        case "text":
        	result = [t: 'string', v: cast(rtData, expression.v, 'string')]
        	break        
		case "bool":
        	result = [t: "boolean", v: cast(rtData, expression.v, "boolean")]
        	break
        case "number":
        case "float":
        	result = [t: "decimal", v: cast(rtData, expression.v, "decimal")]
			result = expression
        	break
        case "duration":
        	long multiplier = 1
            switch (expression.vt) {
            	case 'ms': multiplier = 1; break;
            	case 's': multiplier = 1000; break;
            	case 'm': multiplier = 60000; break;
            	case 'h': multiplier = 3600000; break;
            	case 'd': multiplier = 86400000; break;
            	case 'w': multiplier = 604800000; break;
            	case 'n': multiplier = 2592000000; break;
            	case 'y': multiplier = 31536000000; break;
            }
        	result = [t: "long", v: (long) cast(rtData, cast(rtData, expression.v, 'long') * multiplier, "long")]
        	break
        case "variable":
        	//get variable as {n: name, t: type, v: value}
           	result = [t: 'error', v: 'Invalid variable']
        	result = getVariable(rtData, expression.x)
        	break
        case "device":
        	//get variable as {n: name, t: type, v: value}
            if (expression.v instanceof List) {
            	//already parsed
                result = expression
            } else {
                def deviceIds = (expression.id instanceof List) ? expression.id : (expression.id ? [expression.id] : [])
                if (!deviceIds.size()) {
                    def var = getVariable(rtData, expression.x)
                    if (var && (var.t == 'device')) {
                        deviceIds = var.v
                    }
                }
				result = [t: 'device', v: deviceIds, a: expression.a]
            }
        	break
        case "operand":
        	result = [t: "string", v: cast(rtData, expression.v, "string")]
        	break
        case "function":
            def fn = "func_${expression.n}"
            //in a function, we look for device parameters, they may be lists - we need to reformat all parameters to send them to the function properly
            try {
				def params = []
                if (expression.i && expression.i.size()) {
                    for (i in expression.i) {
                    	def param = simplifyExpression(i)
                        if ((param.t == 'device') || (param.t == 'variable')) {
                        	//if multiple devices involved, we need to spread the param into multiple params
                            param = evaluateExpression(rtData, param)
                            def sz = param.v instanceof List ? param.v.size() : 1
                            switch (sz) {
                            	case 0: break;
                            	case 1: params.push(param); break;
                                default:
		                            for (v in param.v) {
                                    	params.push([t: param.t, a: param.a, v: [v]])
                                    }
                            }
                        } else {
                        	params.push(param);
                        }
                    }
                }
				result = "$fn"(rtData, params)
			} catch (all) {
				//log error
                result = [t: "error", v: all]
			}        	
        	break
        case "expression":
        	//if we have a single item, we simply traverse the expression
        	List items = []
            def operand = -1
            def lastOperand = -1
        	for(item in expression.i) {
	            if (item.t == "operator") {
                	if (operand < 0) {
                    	switch (item.o) {
                        	case '+':
                            case '-':
                            case '^':
                        	case '&':
                        	case '|':
                        	case '<':
                        	case '>':
                        	case '<=':
                        	case '>=':
                        	case '==':
                        	case '!=':
                        	case '<>':
                        	case '!':
                        	case '!!':
                        	case '?':
                            	items.push([t: integer, v: 0, o: item.o])
                                break;
                        	case ':':
                            	if (lastOperand >= 0) {
                                	//groovy-style support for (object ?: value)
                                	items.push(items[lastOperand] + [o: item.o])
                                } else {
                            		items.push([t: integer, v: 0, o: item.o])
                                }
                                break;
                        	case '*':
                            case '/':
                            	items.push([t: integer, v: 1, o: item.o])
                                break;
                        	case '&&':
                            	items.push([t: boolean, v: true, o: item.o])
                                break;
                        	case '||':
                            	items.push([t: boolean, v: false, o: item.o])
                                break;
                        }
                    } else {
                    	items[operand].o = item.o;
                        operand = -1;
                    }
	            } else {
	                items.push(evaluateExpression(rtData, item) + [:])
                    operand = items.size() - 1
                    lastOperand = operand
	            }
	        }
            //clean up operators, ensure there's one for each
            def idx = 0
            for(item in items) {
            	if (!item.o) {
                	switch (item.t) {
                    	case "integer":
                    	case "float":
                    	case "decimal":
                    	case "number":
                        	def nextType = 'string'
                        	if (idx < items.size() - 1) nextType = items[idx+1].t
                        	item.o = (nextType == 'string' || nextType == 'text') ? '+' : '*';
                            break;
                        default:
                        	item.o = '+';
                            break;
                    }
                }
                idx++
            }
            //do the job
            idx = 0
            def secondary = false
            while (items.size() > 1) {
            	//ternary
                if ((items.size() == 3) && (items[0].o == '?') && (items[1].o == ':')) {
                	//we have a ternary operator
                    if (evaluateExpression(rtData, items[0], 'boolean').v) {
                    	items = [items[1]]
                    } else {
                    	items = [items[2]]
                    }                    
                    items[0].o = null;
                    break
                }
	           	//order of operations :D
                idx = 0
                //we first look for !, !!
                for (item in items) {
                	if (((item.o) == '!') || ((item.o) == '!!')) break;
                    secondary = true
                    idx++
                }
                if (idx >= items.size()) {
	                //we then look for power ^
                    idx = 0
	                for (item in items) {
    	            	if ((item.o) == '^') break;
        	            idx++
            	    }
                }
                if (idx >= items.size()) {
                    //we then look for * or /
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '*') || ((item.o) == '/') || ((item.o) == '\\') || ((item.o) == '%')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                    //we then look for + or -
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '+') || ((item.o) == '-')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                    //we then look for >, <, >=, <=
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '>') || ((item.o) == '<') || ((item.o) == '>=') || ((item.o) == '<=')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                    //we then look for ==, !=, <>
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '==') || ((item.o) == '!=') || ((item.o) == '<>')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                    //we then look for bitwise operations &, |
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '&') || ((item.o) == '|')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                    //we then look for logical operations &&, ||
                    idx = 0
                    for (item in items) {
                        if (((item.o) == '&&') || ((item.o) == '||')) break;
                        idx++
                    }
                }
                if (idx >= items.size()) {
                	//just get the first one
                	idx = 0;
                }                
                if (idx >= items.size() - 1) idx = 0
                //we're onto something
                def v = null
                def o = items[idx].o
                def t1 = items[idx].t
                def v1 = items[idx].v
                def t2 = items[idx + 1].t
                def v2 = items[idx + 1].v
                def t = t1
                //fix-ups
                //integer with decimal gives decimal, also *, /, and ^ require decimals
                if ((t1 == 'device') && (t2 == 'device') && ((o == '+') || (o == '-'))) {
					v1 = (v1 instanceof List) ? v1 : [v1]
					v2 = (v2 instanceof List) ? v2 : [v2]
                    v = (o == '+') ? v1 + v2 : v1 - v2                    
        	        //set the results
    	            items[idx + 1].t = 'device'
                    items[idx + 1].v = v
                } else {
                    if ((o == '*') || (o == '/') || (o == '-') || (o == '^')) {
                        if ((t1 != 'number') && (t1 != 'integer') && (t1 != 'decimal') && (t1 != 'float') && (t1 != 'datetime') && (t1 != 'date') && (t1 != 'time')) t1 = 'decimal'
                        if ((t2 != 'number') && (t2 != 'integer') && (t2 != 'decimal') && (t2 != 'float') && (t2 != 'datetime') && (t2 != 'date') && (t2 != 'time')) t2 = 'decimal'
                        t = (t1 == 'datetime') || (t2 == 'datetime') ? 'datetime' : ((t1 == 'date') || (t2 == 'date') ? 'date' : ((t1 == 'time') || (t2 == 'time') ? 'time' : 'decimal'))
                    }
                    if ((o == '\\') || (o == '%') || (o == '&') || (o == '|')) {
                        t1 = 'integer'
                        t2 = 'integer'
                        t = 'integer'
                    }
                    if ((o == '&&') || (o == '||') || (o == '!') || (o == '!!')) {
                        t1 = 'boolean'
                        t2 = 'boolean'
                        t = 'boolean'
                    }
                    if ((o == '+') && ((t1 == 'string') || (t1 == 'text') || (t2 == 'string') || (t2 == 'text'))) {
                        t1 = 'string';
                        t2 = 'string';
                        t = 'string'
                    }
                    if ((((t1 == 'number') || (t1 == 'integer')) && ((t2 == 'decimal') || (t2 == 'float'))) || (((t2 == 'number') || (t2 == 'integer')) && ((t1 == 'decimal') || (t1 == 'float')))) {
                        t1 = 'decimal'
                        t2 = 'decimal'
                        t = 'decimal'
                    }
                    if ((t != 'datetime') && (t != 'date') && (t != 'time') && ((t1 == 'integer') || (t2 == 'integer'))) {
                        t1 = 'integer'
                        t2 = 'integer'
                        t = 'integer'
                    }
                    if ((t != 'datetime') && (t != 'date') && (t != 'time') && ((t1 == 'number') || (t2 == 'number') || (t1 == 'decimal') || (t2 == 'decimal') || (t1 == 'float') || (t2 == 'float'))) {
                        t1 = 'decimal'
                        t2 = 'decimal'
                        t = 'decimal'
                    }
                    if ((o == '==') || (o == '!=') || (o == '<') || (o == '>') || (o == '<=') || (o == '>=') || (o == '<>')) {
                        t1 = t1 == 'string' ? t2 : t1
                        t2 = t2 == 'string' ? t1 : t2
                        t = 'boolean'
                    }
                    v1 = evaluateExpression(rtData, items[idx], t1).v
	                v2 = evaluateExpression(rtData, items[idx + 1], t2).v
                    switch (o) {
                    	case '?':
                    	case ':':
                        	error "Invalid ternary operator. Ternary operator's syntax is ( condition ? trueValue : falseValue ). Please check your syntax and try again.", rtData
                            v = '';
                            break
        	            case '-':
            	        	v = v1 - v2
                	    	break
	                    case '*':
    	                	v = v1 * v2
        	            	break
            	        case '/':
                	    	v = (v2 != 0 ? v1 / v2 : 0)
	                    	break
            	        case '\\':
                	    	v = (int) Math.floor(v2 != 0 ? v1 / v2 : 0)
	                    	break
            	        case '%':
                	    	v = (int) (v2 != 0 ? v1 % v2 : 0)
	                    	break
    	                case '^':
        	            	v = v1 ** v2
            	        	break
                	    case '&':
	                    	v = v1 & v2
    	                	break
        	            case '|':
            	        	v = v1 | v2
                	    	break
                	    case '&&':
	                    	v = !!v1 && !!v2
    	                	break
        	            case '||':
            	        	v = !!v1 || !!v2
                	    	break
                	    case '==':
	                    	v = v1 == v2
    	                	break
        	            case '!=':
        	            case '<>':
            	        	v = v1 != v2
                	    	break
        	            case '<':
            	        	v = v1 < v2
                	    	break
        	            case '>':
            	        	v = v1 > v2
                	    	break
        	            case '<=':
            	        	v = v1 <= v2
                	    	break
        	            case '>=':
            	        	v = v1 >= v2
                	    	break
        	            case '!':
            	        	v = !v2
                	    	break
        	            case '!!':
            	        	v = !!v2
                	    	break
	                    case '+':
    	                default:
        	                v = t == 'string' ? "$v1$v2" : v1 + v2
            	        	break
                	}

					//debug "Calculating ($t1) $v1 $o ($t2) $v2 >> ($t) $v", rtData
    	            
                    //set the results
                    items[idx + 1].t = t
                    items[idx + 1].v = cast(rtData, v, t)
                }
                def sz = items.size()
                items.remove(idx)
            }
    	    result = items[0] ? ((items[0].t == 'device') ? items[0] : evaluateExpression(rtData, items[0])) : [t: 'dynamic', v: null]
	        break
    }
    //return the value, either directly or via cast, if certain data type is requested
  	//when dealing with devices, they need to be "converted" unless the request is to return devices
    if (dataType && (dataType != 'device') && (result.t == 'device')) {
    	//if not a list, make it a list
    	if (!(result.v instanceof List)) result.v = [result.v]
        switch (result.v.size()) {        	
            case 0: result = [t: 'error', v: 'Empty device list']; break;
            case 1: result = getDeviceAttribute(rtData, result.v[0], result.a, result.i); break;
            default: result = [t: 'string', v: buildDeviceAttributeList(rtData, result.v, result.a)]; break;
        }
    }
    if (dataType) {
    	result = [t: dataType, v: cast(rtData, result.v, dataType)] + (result.a ? [a: result.a] : [:]) + (result.i ? [a: result.i] : [:])
    }
    result.d = now() - time;
	return result
}

private buildList(list, suffix = 'and') {
    if (!list) return ''
    if (!(list instanceof List)) list = [list]
	def cnt = 1
	def result = ""
	for (item in list) {
		result += "$item" + (cnt < list.size() ? (cnt == list.size() - 1 ? " $suffix " : ", ") : "")
		cnt++
	}
	return result;
}

private buildDeviceList(rtData, devices, suffix = 'and') {
    if (!devices) return ''
    if (!(devices instanceof List)) devices = [devices]
    def list = []
	for (device in devices) {
    	def dev = getDevice(rtData, device)
        if (dev) list.push(dev)
	}
	return buildList(list, suffix);
}

private buildDeviceAttributeList(rtData, devices, attribute, suffix = 'and') {
    if (!devices) return ''
    if (!(devices instanceof List)) devices = [devices]
    def list = []
	for (device in devices) {
    	def value = getDeviceAttribute(rtData, device, attribute).v
        list.push(value)
	}
	return buildList(list, suffix);
}


/******************************************************************************/
/*** dewPoint returns the calculated dew point temperature					***/
/*** Usage: dewPoint(temperature, relativeHumidity[, scale])				***/
/******************************************************************************/
private func_dewpoint(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting dewPoint(temperature, relativeHumidity[, scale])"];
    }
    double t = evaluateExpression(rtData, params[0], 'decimal').v
    double rh = evaluateExpression(rtData, params[1], 'decimal').v
    //if no temperature scale is provided, we assume the location's temperature scale
    boolean fahrenheit = cast(rtData, params.size() > 2 ? evaluateExpression(rtData, params[2]).v : location.temperatureScale, "string").toUpperCase() == "F"
    if (fahrenheit) {
    	//convert temperature to Celsius
        t = (t - 32.0) * 5.0 / 9.0
    }
    //convert rh to percentage
    if ((rh > 0) && (rh < 1)) {
    	rh = rh * 100.0
    }
    double b = (Math.log(rh / 100) + ((17.27 * t) / (237.3 + t))) / 17.27
	double result = (237.3 * b) / (1 - b)
    if (fahrenheit) {
    	//convert temperature back to Fahrenheit
        result = result * 9.0 / 5.0 + 32.0
    }
    return [t: "decimal", v: result]
}

/******************************************************************************/
/*** celsius converts temperature from Fahrenheit to Celsius				***/
/*** Usage: celsius(temperature)											***/
/******************************************************************************/
private func_celsius(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting celsius(temperature)"];
    }
    double t = evaluateExpression(rtData, params[0], 'decimal').v
    //convert temperature to Celsius
    return [t: "decimal", v: (double) (t - 32.0) * 5.0 / 9.0]
}


/******************************************************************************/
/*** fahrenheit converts temperature from Celsius to Fahrenheit				***/
/*** Usage: fahrenheit(temperature)											***/
/******************************************************************************/
private func_fahrenheit(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting fahrenheit(temperature)"];
    }
    double t = evaluateExpression(rtData, params[0], 'decimal').v
    //convert temperature to Fahrenheit
    return [t: "decimal", v: (double) t * 9.0 / 5.0 + 32.0]
}

/******************************************************************************/
/*** integer converts a decimal value to it's integer value					***/
/*** Usage: integer(decimal or string)										***/
/******************************************************************************/
private func_integer(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting integer(decimal or string)"];
    }
    return [t: "integer", v: evaluateExpression(rtData, params[0], 'integer').v]
}
private func_int(rtData, params) { return func_integer(rtData, params) }

/******************************************************************************/
/*** decimal/float converts an integer value to it's decimal value			***/
/*** Usage: decimal(integer or string)										***/
/******************************************************************************/
private func_decimal(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting decimal(integer or string)"];
    }
    return [t: "decimal", v: evaluateExpression(rtData, params[0], 'decimal').v]
}
private func_float(rtData, params) { return func_decimal(rtData, params) }
private func_number(rtData, params) { return func_decimal(rtData, params) }

/******************************************************************************/
/*** string converts an value to it's string value							***/
/*** Usage: string(anything)												***/
/******************************************************************************/
private func_string(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting string(anything)"];
    }
	def result = ''
    for(param in params) {
    	result += evaluateExpression(rtData, param, 'string').v
    }
    return [t: "string", v: result]
}
private func_concat(rtData, params) { return func_string(rtData, params) }
private func_text(rtData, params) { return func_string(rtData, params) }

/******************************************************************************/
/*** boolean converts a value to it's boolean value							***/
/*** Usage: boolean(anything)												***/
/******************************************************************************/
private func_boolean(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting boolean(anything)"];
    }
    return [t: "boolean", v: evaluateExpression(rtData, params[0], 'boolean').v]
}
private func_bool(rtData, params) { return func_boolean(rtData, params) }

/******************************************************************************/
/*** sqr converts a decimal value to it's square decimal value				***/
/*** Usage: sqr(integer or decimal or string)								***/
/******************************************************************************/
private func_sqr(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting sqr(integer or decimal or string)"];
    }
    return [t: "decimal", v: evaluateExpression(rtData, params[0], 'decimal').v ** 2]
}

/******************************************************************************/
/*** sqrt converts a decimal value to it's square root decimal value		***/
/*** Usage: sqrt(integer or decimal or string)								***/
/******************************************************************************/
private func_sqrt(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting sqrt(integer or decimal or string)"];
    }
    return [t: "decimal", v: Math.sqrt(evaluateExpression(rtData, params[0], 'decimal').v)]
}

/******************************************************************************/
/*** power converts a decimal value to it's power decimal value				***/
/*** Usage: power(integer or decimal or string, power)						***/
/******************************************************************************/
private func_power(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting sqrt(integer or decimal or string, power)"];
    }
    return [t: "decimal", v: evaluateExpression(rtData, params[0], 'decimal').v ** evaluateExpression(rtData, params[1], 'decimal').v]
}

/******************************************************************************/
/*** round converts a decimal value to it's rounded value					***/
/*** Usage: round(decimal or string[, precision])							***/
/******************************************************************************/
private func_round(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting round(decimal or string[, precision])"];
    }
    int precision = (params.size() > 1) ? evaluateExpression(rtData, params[1], 'integer').v : 0
    return [t: "decimal", v: Math.round(evaluateExpression(rtData, params[0], 'decimal').v * (10 ** precision)) / (10 ** precision)]
}

/******************************************************************************/
/*** floor converts a decimal value to it's closest lower integer value		***/
/*** Usage: floor(decimal or string)										***/
/******************************************************************************/
private func_floor(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting floor(decimal or string)"];
    }
    return [t: "integer", v: cast(rtData, Math.floor(evaluateExpression(rtData, params[0], 'decimal').v), 'integer')]
}

/******************************************************************************/
/*** ceiling converts a decimal value to it's closest higher integer value	***/
/*** Usage: ceiling(decimal or string)										***/
/******************************************************************************/
private func_ceiling(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting ceiling(decimal or string)"];
    }
    return [t: "integer", v: cast(rtData, Math.ceil(evaluateExpression(rtData, params[0], 'decimal').v), 'integer')]
}
private func_ceil(rtData, params) { return func_ceiling(rtData, params) }


/******************************************************************************/
/*** sprintf converts formats a series of values into a string				***/
/*** Usage: sprintf(format, arguments)										***/
/******************************************************************************/
private func_sprintf(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting sprintf(format, arguments)"];
    }
    def format = evaluateExpression(rtData, params[0], 'string').v
    List args = []
    for (int x = 1; x < params.size(); x++) {
    	args.push(evaluateExpression(rtData, params[x]).v)
    }
    try {
        return [t: "string", v: sprintf(format, args)]
    } catch(all) {
    	return [t: "error", v: "$all"]
    }
}
private func_format(rtData, params) { return func_sprintf(rtData, params) }

/******************************************************************************/
/*** left returns a substring of a value									***/
/*** Usage: left(string, count)												***/
/******************************************************************************/
private func_left(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting left(string, count)"];
    }
    def value = evaluateExpression(rtData, params[0], 'string').v
    def count = evaluateExpression(rtData, params[1], 'integer').v
    if (count > value.size()) count = value.size()    
    return [t: "string", v: value.substring(0, count)]
}

/******************************************************************************/
/*** right returns a substring of a value									***/
/*** Usage: right(string, count)												***/
/******************************************************************************/
private func_right(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting right(string, count)"];
    }
    def value = evaluateExpression(rtData, params[0], 'string').v
    def count = evaluateExpression(rtData, params[1], 'integer').v
    if (count > value.size()) count = value.size()
    return [t: "string", v: value.substring(value.size() - count, value.size())]
}

/******************************************************************************/
/*** substring returns a substring of a value								***/
/*** Usage: substring(string, start, count)									***/
/******************************************************************************/
private func_substring(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting substring(string, start, count)"];
    }
    def value = evaluateExpression(rtData, params[0], 'string').v
    def start = evaluateExpression(rtData, params[1], 'integer').v
   	def count = params.size() > 2 ? evaluateExpression(rtData, params[2], 'integer').v : null
    def end = null
    def result = ''
    if ((start < value.size()) && (start > -value.size())) {
        if (count != null) {
        	if (count < 0) {
           		//reverse
                start = start < 0 ? -start : value.size() - start
                count = - count
                value = value.reverse()
            }
        	if (start >= 0) {
            	if (count > value.size() - start) count = value.size() - start
            } else {
            	if (count > -start) count = -start
            }
        }
        start = start >= 0 ? start : value.size() + start
        if (count > value.size() - start) count = value.size() - start
        result = value.substring(start, count == null ? null : start + count)
    }
    return [t: "string", v: result]
}
private func_substr(rtData, params) { return func_substring(rtData, params) }
private func_mid(rtData, params) { return func_substring(rtData, params) }

/******************************************************************************/
/*** replace replaces a search text inside of a value						***/
/*** Usage: replace(string, search, replace[, [..], search, replace])		***/
/******************************************************************************/
private func_replace(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 3)) {
    	return [t: "error", v: "Invalid parameters. Expecting replace(string, search, replace)"];
    }
    def value = evaluateExpression(rtData, params[0], 'string').v
    int cnt = Math.floor((params.size() - 1) / 2)
    for (int i = 0; i < cnt; i++) {
    	def search = evaluateExpression(rtData, params[i * 2 + 1], 'string').v
        if ((search.size() > 2) && search.startsWith('/') && search.endsWith('/')) {
        	search = ~search.substring(1, search.size() - 1)
        }
        value = value.replaceAll(search, evaluateExpression(rtData, params[i * 2 + 2], 'string').v)
    }
    return [t: "string", v: value]
}


/******************************************************************************/
/*** lower returns a lower case value of a string							***/
/*** Usage: lower(string)													***/
/******************************************************************************/
private func_lower(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting lower(string)"];
    }
    def result = ''
    for(param in params) {
    	result += evaluateExpression(rtData, param, 'string').v
    }
    return [t: "string", v: result.toLowerCase()]
}

/******************************************************************************/
/*** upper returns a upper case value of a string							***/
/*** Usage: upper(string)													***/
/******************************************************************************/
private func_upper(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting upper(string)"];
    }
    def result = ''
    for(param in params) {
    	result += evaluateExpression(rtData, param, 'string').v
    }
    return [t: "string", v: result.toUpperCase()]
}

/******************************************************************************/
/*** title returns a title case value of a string							***/
/*** Usage: title(string)													***/
/******************************************************************************/
private func_title(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting title(string)"];
    }
    def result = ''
    for(param in params) {
    	result += evaluateExpression(rtData, param, 'string').v
    }
    return [t: "string", v: result.tokenize(" ")*.toLowerCase()*.capitalize().join(" ")]
}

/******************************************************************************/
/*** avg calculates the average of a series of numeric values				***/
/*** Usage: avg(values)														***/
/******************************************************************************/
private func_avg(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting avg(value1, value2, ..., valueN)"];
    }
    float sum = 0
    for (param in params) {
    	sum += evaluateExpression(rtData, param, 'decimal').v
    }
    return [t: "decimal", v: sum / params.size()]
}

/******************************************************************************/
/*** median returns the value in the middle of a sorted array				***/
/*** Usage: median(values)													***/
/******************************************************************************/
private func_median(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting median(value1, value2, ..., valueN)"];
    }
    List data = params.collect{ evaluateExpression(rtData, it, 'dynamic') }.sort{ it.v }
    if (data.size()) {
    	return data[(int) Math.floor(data.size() / 2)]
    }
    return [t: 'dynamic', v: '']
}


/******************************************************************************/
/*** least returns the value that is least found a series of numeric values	***/
/*** Usage: least(values)													***/
/******************************************************************************/
private func_least(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting least(value1, value2, ..., valueN)"];
    }
    Map data = [:]
    for (param in params) {
    	def value = evaluateExpression(rtData, param, 'dynamic')
    	data[value.v] = [t: value.t, v: value.v, c: (data[value.v]?.c ?: 0) + 1]
    }
    def value = data.sort{ it.value.c }.collect{ it.value }[0]
    return [t: value.t, v: value.v]
}

/******************************************************************************/
/*** most returns the value that is most found a series of numeric values	***/
/*** Usage: most(values)													***/
/******************************************************************************/
private func_most(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting most(value1, value2, ..., valueN)"];
    }
    Map data = [:]
    for (param in params) {
    	def value = evaluateExpression(rtData, param, 'dynamic')
    	data[value.v] = [t: value.t, v: value.v, c: (data[value.v]?.c ?: 0) + 1]
    }
    def value = data.sort{ - it.value.c }.collect{ it.value }[0]
    return [t: value.t, v: value.v]
}

/******************************************************************************/
/*** sum calculates the sum of a series of numeric values					***/
/*** Usage: sum(values)														***/
/******************************************************************************/
private func_sum(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting sum(value1, value2, ..., valueN)"];
    }
    float sum = 0
    for (param in params) {
    	sum += evaluateExpression(rtData, param, 'decimal').v
    }
    return [t: "decimal", v: sum]
}

/******************************************************************************/
/*** variance calculates the standard deviation of a series of numeric values */
/*** Usage: stdev(values)													***/
/******************************************************************************/
private func_variance(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting variance(value1, value2, ..., valueN)"];
    }
    float sum = 0
    List values = []
    for (param in params) {
    	float value = evaluateExpression(rtData, param, 'decimal').v
        values.push(value)
        sum += value
    }
    float avg = sum / values.size()
    sum = 0
    for(int i  = 0; i < values.size(); i++) {
    	sum += (values[i] - avg) ** 2
    }
    return [t: "decimal", v: sum / values.size()]
}

/******************************************************************************/
/*** stdev calculates the standard deviation of a series of numeric values	***/
/*** Usage: stdev(values)													***/
/******************************************************************************/
private func_stdev(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting stdev(value1, value2, ..., valueN)"];
    }
    def result = func_variance(rtData, params)
    return [t: "decimal", v: Math.sqrt(result.v)]
}

/******************************************************************************/
/*** min calculates the minimum of a series of numeric values				***/
/*** Usage: min(values)														***/
/******************************************************************************/
private func_min(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting min(value1, value2, ..., valueN)"];
    }
    List data = params.collect{ evaluateExpression(rtData, it, 'dynamic') }.sort{ it.v }
    if (data.size()) {
    	return data[0]
    }
    return [t: 'dynamic', v: '']
}

/******************************************************************************/
/*** max calculates the maximum of a series of numeric values				***/
/*** Usage: max(values)														***/
/******************************************************************************/
private func_max(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting max(value1, value2, ..., valueN)"];
    }
    List data = params.collect{ evaluateExpression(rtData, it, 'dynamic') }.sort{ it.v }
    if (data.size()) {
    	return data[data.size() - 1]
    }
    return [t: 'dynamic', v: '']
}


/******************************************************************************/
/*** count calculates the number of true/non-zero/non-empty items in a series of numeric values		***/
/*** Usage: count(values)														***/
/******************************************************************************/
private func_count(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting count(value1, value2, ..., valueN)"];
    }
    def count = 0
    for (param in params) {
    	count += evaluateExpression(rtData, param, 'boolean').v ? 1 : 0
    }
    return [t: "integer", v: count]
}

/******************************************************************************/
/*** age returns the number of milliseconds an attribute had the current value*/
/*** Usage: age([device:attribute])											***/
/******************************************************************************/
private func_age(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting age([device:attribute])"];
    }
    def param = evaluateExpression(rtData, params[0], 'device')
    if ((param.t == 'device') && (param.a) && param.v.size()) {
		def device = getDevice(rtData, param.v[0])
        if (device) {
        	def state = device.currentState(param.a)
            if (state) {
            	long result = now() - state.getDate().getTime()
                return [t: "long", v: result]
            }
        }
    }
    return [t: "error", v: "Invalid device"]
}

/******************************************************************************/
/*** previousAge returns the number of milliseconds an attribute had the 	***/
/*** previous value															***/
/*** Usage: previousAge([device:attribute])									***/
/******************************************************************************/
private func_previousage(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting previousAge([device:attribute])"];
    }
    def param = evaluateExpression(rtData, params[0], 'device')
    if ((param.t == 'device') && (param.a) && param.v.size()) {
		def device = getDevice(rtData, param.v[0])
        if (device) {
        	def states = device.statesSince(param.a, new Date(now() - 604500000), [max: 5])
            if (states.size() > 1) {
            	def newValue = states[0].getValue()
                //some events get duplicated, so we really want to look for the last "different valued" state
                for(int i = 1; i < states.size(); i++) {
                	if (states[i].getValue() != newValue) {
            			def result = now() - states[i].getDate().getTime()
                		return [t: "long", v: result]
                    }
                }
            }
            //we're saying 7 days, though it may be wrong - but we have no data
             return [t: "long", v: 604800000]
        }
    }
    return [t: "error", v: "Invalid device"]
}

/******************************************************************************/
/*** previousValue returns the previous value of the attribute				***/
/*** Usage: previousValue([device:attribute])								***/
/******************************************************************************/
private func_previousvalue(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting previousValue([device:attribute])"];
    }
    def param = evaluateExpression(rtData, params[0], 'device')
    if ((param.t == 'device') && (param.a) && param.v.size()) {
    	def attribute = rtData.attributes[param.a]
        if (attribute) {
			def device = getDevice(rtData, param.v[0])
	        if (device) {
                def states = device.statesSince(param.a, new Date(now() - 604500000), [max: 5])
                if (states.size() > 1) {
                    def newValue = states[0].getValue()
                    //some events get duplicated, so we really want to look for the last "different valued" state
                    for(int i = 1; i < states.size(); i++) {
                        def result = states[i].getValue()
                        if (result != newValue) {
                            return [t: attribute.t, v: cast(rtData, result, attribute.t)]
                        }
                    }                    
                }
                //we're saying 7 days, though it may be wrong - but we have no data
                return [t: 'string', v: '']
            }
        }
    }
    return [t: "error", v: "Invalid device"]
}

/******************************************************************************/
/*** newer returns the number of devices whose attribute had the current    ***/
/*** value for less than the specified number of milliseconds			    ***/
/*** Usage: newer([device:attribute] [,.., [device:attribute]], threshold)	***/
/******************************************************************************/
private func_newer(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting newer([device:attribute] [,.., [device:attribute]], threshold)"];
    }
    def threshold = evaluateExpression(rtData, params[params.size() - 1], 'integer').v
    int result = 0
    for (def i = 0; i < params.size() - 1; i++) {
    	def age = func_age(rtData, [params[i]])
        if ((age.t != 'error') && (age.v < threshold)) result++
    }
    return [t: "integer", v: result]
}

/******************************************************************************/
/*** older returns the number of devices whose attribute had the current    ***/
/*** value for more than the specified number of milliseconds			    ***/
/*** Usage: older([device:attribute] [,.., [device:attribute]], threshold)	***/
/******************************************************************************/
private func_older(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() < 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting older([device:attribute] [,.., [device:attribute]], threshold)"];
    }
    def threshold = evaluateExpression(rtData, params[params.size() - 1], 'integer').v
    int result = 0
    for (def i = 0; i < params.size() - 1; i++) {
    	def age = func_age(rtData, [params[i]])
        if ((age.t != 'error') && (age.v >= threshold)) result++
    }
    return [t: "integer", v: result]
}

/******************************************************************************/
/*** startsWith returns true if a string starts with a substring			***/
/*** Usage: startsWith(string, substring)									***/
/******************************************************************************/
private func_startswith(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting startsWith(string, substring)"];
    }
    def string = evaluateExpression(rtData, params[0], 'string').v
    def substring = evaluateExpression(rtData, params[1], 'string').v
    return [t: "boolean", v: string.startsWith(substring)]
}

/******************************************************************************/
/*** endsWith returns true if a string ends with a substring				***/
/*** Usage: endsWith(string, substring)										***/
/******************************************************************************/
private func_endswith(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting endsWith(string, substring)"];
    }
    def string = evaluateExpression(rtData, params[0], 'string').v
    def substring = evaluateExpression(rtData, params[1], 'string').v
    return [t: "boolean", v: string.endsWith(substring)]
}

/******************************************************************************/
/*** contains returns true if a string contains a substring					***/
/*** Usage: contains(string, substring)										***/
/******************************************************************************/
private func_contains(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting contains(string, substring)"];
    }
    def string = evaluateExpression(rtData, params[0], 'string').v
    def substring = evaluateExpression(rtData, params[1], 'string').v
    return [t: "boolean", v: string.contains(substring)]
}

/******************************************************************************/
/*** eq returns true if two values are equal								***/
/*** Usage: eq(value1, value2)												***/
/******************************************************************************/
private func_eq(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting eq(value1, value2)"];
    }
    def t = params[0].t == 'device' ? params[1].t : params[0].t
    def value1 = evaluateExpression(rtData, params[0], t)
    def value2 = evaluateExpression(rtData, params[1], t)
    return [t: "boolean", v: value1.v == value2.v]
}

/******************************************************************************/
/*** lt returns true if value1 < value2										***/
/*** Usage: lt(value1, value2)												***/
/******************************************************************************/
private func_lt(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting lt(value1, value2)"];
    }
    def value1 = evaluateExpression(rtData, params[0])
    def value2 = evaluateExpression(rtData, params[1], value1.t)
    return [t: "boolean", v: value1.v < value2.v]
}

/******************************************************************************/
/*** le returns true if value1 <= value2									***/
/*** Usage: le(value1, value2)												***/
/******************************************************************************/
private func_le(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting le(value1, value2)"];
    }
    def value1 = evaluateExpression(rtData, params[0])
    def value2 = evaluateExpression(rtData, params[1], value1.t)
    return [t: "boolean", v: value1.v <= value2.v]
}

/******************************************************************************/
/*** gt returns true if value1 > value2									***/
/*** Usage: gt(value1, value2)												***/
/******************************************************************************/
private func_gt(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting gt(value1, value2)"];
    }
    def value1 = evaluateExpression(rtData, params[0])
    def value2 = evaluateExpression(rtData, params[1], value1.t)
    return [t: "boolean", v: value1.v > value2.v]
}

/******************************************************************************/
/*** ge returns true if value1 >= value2									***/
/*** Usage: ge(value1, value2)												***/
/******************************************************************************/
private func_ge(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting ge(value1, value2)"];
    }
    Map value1 = evaluateExpression(rtData, params[0])
    Map value2 = evaluateExpression(rtData, params[1], value1.t)
    return [t: "boolean", v: value1.v >= value2.v]
}

/******************************************************************************/
/*** not returns the negative boolean value 								***/
/*** Usage: not(value)														***/
/******************************************************************************/
private func_not(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting not(value)"];
    }
    boolean value = evaluateExpression(rtData, params[0], 'boolean').v
    return [t: "boolean", v: !value]
}

/******************************************************************************/
/*** if evaluates a boolean and returns value1 if true, or value2 otherwise ***/
/*** Usage: if(condition, valueIfTrue, valueIfFalse)						***/
/******************************************************************************/
private func_if(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 3)) {
    	return [t: "error", v: "Invalid parameters. Expecting if(condition, valueIfTrue, valueIfFalse)"];
    }
    boolean value = evaluateExpression(rtData, params[0], 'boolean').v
    return value ? evaluateExpression(rtData, params[1]) : evaluateExpression(rtData, params[2])
}

/******************************************************************************/
/*** isEmpty returns true if the value is empty								***/
/*** Usage: isEmpty(value)													***/
/******************************************************************************/
private func_isempty(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting isEmpty(value)"];
    }
    def value = evaluateExpression(rtData, params[0])
    boolean result = (value.v instanceof List ? (value.v == [null]) || (value.v == []) || (value.v == ['null']) : false) || (value.v == null) || (value.t == 'error') || (value.v == 'null') || (cast(rtData, value.v, 'string') == '')
    return [t: "boolean", v: result]
}

/******************************************************************************/
/*** date returns the value as a date type									***/
/*** Usage: date(value)														***/
/******************************************************************************/
private func_date(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting date(value)"];
    }
    long value = evaluateExpression(rtData, params[0], 'date').v
    return [t: "date", v: value]
}

/******************************************************************************/
/*** time returns the value as a time type									***/
/*** Usage: time(value)														***/
/******************************************************************************/
private func_time(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 1)) {
    	return [t: "error", v: "Invalid parameters. Expecting time(value)"];
    }
    long value = evaluateExpression(rtData, params[0], 'time').v
    return [t: "time", v: value]
}

/******************************************************************************/
/*** addSeconds returns the value as a time type							***/
/*** Usage: addSeconds(dateTime, seconds)									***/
/******************************************************************************/
private func_addseconds(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting addSeconds(dateTime, seconds)"];
    }
    long value = evaluateExpression(rtData, params[0], 'datetime').v
    long delta = evaluateExpression(rtData, params[1], 'long').v * 1000
    return [t: "datetime", v: value + delta]
}

/******************************************************************************/
/*** addMinutes returns the value as a time type							***/
/*** Usage: addMinutes(dateTime, minutes)									***/
/******************************************************************************/
private func_addminutes(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting addMinutes(dateTime, minutes)"];
    }
    long value = evaluateExpression(rtData, params[0], 'datetime').v
    long delta = evaluateExpression(rtData, params[1], 'long').v * 60000
    return [t: "datetime", v: value + delta]
}

/******************************************************************************/
/*** addHours returns the value as a time type								***/
/*** Usage: addHours(dateTime, hours)										***/
/******************************************************************************/
private func_addhours(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting addHours(dateTime, hours)"];
    }
    long value = evaluateExpression(rtData, params[0], 'datetime').v
    long delta = evaluateExpression(rtData, params[1], 'long').v * 3600000
    return [t: "datetime", v: value + delta]
}

/******************************************************************************/
/*** addDays returns the value as a time type								***/
/*** Usage: addDays(dateTime, days)											***/
/******************************************************************************/
private func_adddays(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting addDays(dateTime, days)"];
    }
    long value = evaluateExpression(rtData, params[0], 'datetime').v
    long delta = evaluateExpression(rtData, params[1], 'long').v * 86400000
    return [t: "datetime", v: value + delta]
}

/******************************************************************************/
/*** addWeeks returns the value as a time type								***/
/*** Usage: addWeeks(dateTime, weeks)										***/
/******************************************************************************/
private func_addweeks(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 2)) {
    	return [t: "error", v: "Invalid parameters. Expecting addWeeks(dateTime, weeks)"];
    }
    long value = evaluateExpression(rtData, params[0], 'datetime').v
    long delta = evaluateExpression(rtData, params[1], 'long').v * 604800000
    return [t: "datetime", v: value + delta]
}

/******************************************************************************/
/*** isBetween returns true if value >= startValue and value <= endValue	***/
/*** Usage: isBetween(value, startValue, endValue)							***/
/******************************************************************************/
private func_isbetween(rtData, params) {
	if (!params || !(params instanceof List) || (params.size() != 3)) {
    	return [t: "error", v: "Invalid parameters. Expecting isBetween(value, startValue, endValue)"];
    }
    def value = evaluateExpression(rtData, params[0])
    def startValue = evaluateExpression(rtData, params[1], value.t)
    def endValue = evaluateExpression(rtData, params[2], value.t)
    return [t: "boolean", v: (value.v >= startValue.v) && (value.v <= endValue.v)]
}







/******************************************************************************/
/*** 																		***/
/*** COMMON PUBLISHED METHODS												***/
/*** 																		***/
/******************************************************************************/

def mem(showBytes = true) {
	def bytes = state.toString().length()
	return Math.round(100.00 * (bytes/ 100000.00)) + "%${showBytes ? " ($bytes bytes)" : ""}"
}
/******************************************************************************/
/***																		***/
/*** UTILITIES																***/
/***																		***/
/******************************************************************************/

def String md5(String md5) {
   try {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5")
        byte[] array = md.digest(md5.getBytes())
        def result = ""
        for (int i = 0; i < array.length; ++i) {
          result += Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3)
       }
        return result
    } catch (java.security.NoSuchAlgorithmException e) {
    }
    return null;
}

def String hashId(id) {
	return ":${md5("core." + id)}:"
}

private cast(rtData, value, dataType, srcDataType = null) {
	if (dataType == 'dynamic') return value
	def trueStrings = ["1", "true", "on", "open", "locked", "active", "wet", "detected", "present", "occupied", "muted", "sleeping"]
	def falseStrings = ["0", "false", "off", "closed", "unlocked", "inactive", "dry", "clear", "not detected", "not present", "not occupied", "unmuted", "not sleeping"]
	//get rid of GStrings
    if (value == null) {
    	value = '';
        srcDataType = 'string';
    }
	value = (value instanceof GString) ? value.toString() : value
    if (!srcDataType) {
        switch (value) {
            case {it instanceof List}: srcDataType = 'device'; break;
            case {it instanceof Boolean}: srcDataType = 'boolean'; break;
            case {it instanceof String}: srcDataType = 'string'; break;
            case {it instanceof String}: srcDataType = 'string'; break;
            case {it instanceof Integer}: srcDataType = 'integer'; break;
            case {it instanceof BigInteger}: srcDataType = 'long'; break;
            case {it instanceof Long}: srcDataType = 'long'; break;
            case {it instanceof Float}: srcDataType = 'decimal'; break;
            case {it instanceof BigDecimal}: srcDataType = 'decimal'; break;
            default: value = "$value".toString(); srcDataType = 'string'; break;
        }
	}
    //overrides
    switch (srcDataType) {
    	case 'bool': srcDataType = 'boolean'; break;
    	case 'number': srcDataType = 'decimal'; break;
    	case 'enum': srcDataType = 'string'; break;
    }
    switch (dataType) {
    	case 'bool': dataType = 'boolean'; break;
    	case 'number': dataType = 'decimal'; break;
    	case 'enum': dataType = 'string'; break;
    }
    //perform the conversion
	switch (dataType) {
		case "string":
		case "text":
        	switch (srcDataType) {
            	case 'boolean': return value ? "true" : "false";
            	case 'integer':
            	case 'long': if (value > 9999999999) { return formatLocalTime(value) }; break;
                case 'time': return formatLocalTime(value);
                case 'date':
                case 'datetime': return formatLocalTime(value);
                case 'device': return buildDeviceList(rtData, value);
            }
			return "$value".toString()
		case "integer":
			switch (srcDataType) {
            	case 'string':
                    value = value.replaceAll(/[^\d.-]/, '')
                    if (value.isInteger())
                        return (int) value.toInteger()
                    if (value.isFloat())
                        return (int) Math.floor(value.toFloat())
                    if (value in trueStrings)
                        return (int) 1
                    break
				case 'boolean': return (int) (value ? 1 : 0);
            }
			def result = (int) 0
			try {
				result = (int) value
			} catch(all) {
				result = (int) 0
			}
			return result ? result : (int) 0
		case "long":
			switch (srcDataType) {
            	case 'string':
                    value = value.replaceAll(/[^\d.-]/, '')
                    if (value.isLong())
                        return (long) value.toLong()
                    if (value.isInteger())
                        return (long) value.toInteger()
                    if (value.isFloat())
                        return (long) Math.floor(value.toFloat())
                    if (value in trueStrings)
                        return (long) 1
                    break
				case 'boolean': return (long) (value ? 1 : 0);
            }
			def result = (long) 0
			try {
				result = (long) value
			} catch(all) {
				result = (long) 0
			}
			return result ? result : (long) 0
		case "decimal":
			switch (srcDataType) {
            	case 'string':
                    value = value.replaceAll(/[^\d.-]/, '')
                    if (value.isFloat())
                        return (float) value.toFloat()
                    if (value.isLong())
                        return (float) value.toLong()
                    if (value.isInteger())
                        return (float) value.toInteger()
                    if (value in trueStrings)
                        return (float) 1
					break
				case 'boolean': return (float) (value ? 1 : 0);
            }
			def result = (float) 0
			try {
				result = (float) value
			} catch(all) {
			}
			return result ? result : (float) 0
		case "boolean":
			switch (srcDataType) {
            	case 'integer':
            	case 'decimal':
            	case 'boolean':
					return !!value;
            	case 'device':
					return (value instanceof List) && value.size();
			}
            if (value) {
            	if ("$value".toLowerCase().trim() in trueStrings) return true
	            if ("$value".toLowerCase().trim() in falseStrings) return false
            }
			return !!value
		case "time":
        	def n = localTime()
			return localToUtcTime(n - (n % 86400000) + (utcToLocalTime((srcDataType == 'string') ? localToUtcTime(value) : cast(rtData, value, "long")) % 86400000))
		case "date":
			def d = utcToLocalTime((srcDataType == 'string') ? localToUtcTime(value) : cast(rtData, value, "long"))
            return localToUtcTime(d - (d % 86400000))
		case "datetime":
			return ((srcDataType == 'string') ? localToUtcTime(value) : cast(rtData, value, "long"))
		case "vector3":
			return value instanceof String ? 0 : cast(rtData, value, "long")
		case "orientation":
			return getThreeAxisOrientation(value)
        case 'ms': return (long) cast(rtData, value, 'long')
        case 's': return (long) cast(rtData, value, 'long') * 1000
        case 'm': return (long) cast(rtData, value, 'long') * 60000
        case 'h': return (long) cast(rtData, value, 'long') * 3600000
        case 'd': return (long) cast(rtData, value, 'long') * 86400000
        case 'w': return (long) cast(rtData, value, 'long') * 604800000
        case 'n': return (long) cast(rtData, value, 'long') * 2592000000
        case 'y': return (long) cast(rtData, value, 'long') * 31536000000
        case 'device':
        	//device type is an array of device Ids
        	if (value instanceof List) {
            	def x = value.size()
            	value.removeAll{ !it }
                return value
            }
            def v = cast(rtData, value, 'string')
            if (v) return [v]
            return []
	}
	//anything else...
	return value
}

private utcToLocalDate(dateOrTimeOrString = null) {
	if (dateOrTimeOrString instanceof String) {
		//get UTC time
        try {        
			dateOrTimeOrString = timeToday(dateOrTimeOrString, location.timeZone).getTime()
        } catch (all) {
        	error "Error converting $dateOrTimeOrString to Date: ", null, null, all
        }
	}
	if (dateOrTimeOrString instanceof Date) {
		//get unix time
		dateOrTimeOrString = dateOrTimeOrString.getTime()
	}
	if (!dateOrTimeOrString) {
		dateOrTimeOrString = now()
	}
	if (dateOrTimeOrString instanceof Long) {
		return new Date(dateOrTimeOrString + location.timeZone.getOffset(dateOrTimeOrString))
	}
	return null
}
private localDate() { return utcToLocalDate() }

private utcToLocalTime(dateOrTimeOrString = null) {
	if (dateOrTimeOrString instanceof String) {
		//get UTC time
		dateOrTimeOrString = timeToday(dateOrTimeOrString, location.timeZone).getTime()
	}
	if (dateOrTimeOrString instanceof Date) {
		//get unix time
		dateOrTimeOrString = dateOrTimeOrString.getTime()
	}
	if (!dateOrTimeOrString) {
		dateOrTimeOrString = now()
	}
	if (dateOrTimeOrString instanceof Long) {
		return dateOrTimeOrString + location.timeZone.getOffset(dateOrTimeOrString)
	}
	return null
}
private localTime() { return utcToLocalTime() }

private localToUtcDate(dateOrTime) {
	if (dateOrTime instanceof Date) {
		//get unix time
		dateOrTime = dateOrTime.getTime()
	}
	if (dateOrTime instanceof Long) {
		return new Date(dateOrTime - location.timeZone.getOffset(dateOrTime))
	}
	return null
}

private localToUtcTime(dateOrTimeOrString) {
	if (dateOrTimeOrString instanceof Date) {
		//get unix time
		dateOrTimeOrString = dateOrTimeOrString.getTime()
	}
	if (dateOrTimeOrString instanceof Long) {
		return dateOrTimeOrString - location.timeZone.getOffset(dateOrTimeOrString)
	}
	if (dateOrTimeOrString instanceof String) {
		//get unix time
        try {
			return timeToday(dateOrTimeOrString, location.timeZone).getTime()
		} catch (all) {
        	error "Error converting '$dateOrTimeOrString' to date/time: ", rtData, null, all
        }
	}
	return null
}

private formatLocalTime(time, format = "EEE, MMM d yyyy @ h:mm:ss a z") {
	if (time instanceof Long) {
		time = new Date(time)
	}
	if (time instanceof String) {
		//get UTC time
		time = timeToday(time, location.timeZone)
	}
    if (!(time instanceof Date)) {
		return null
	}
	def formatter = new java.text.SimpleDateFormat(format)
	formatter.setTimeZone(location.timeZone)
	return formatter.format(time)
}


private Map hexToColor(hex){
    hex = hex ? "$hex".toString() : '000000'
    if (hex.startsWith('#')) hex = hex.substring(1)
    if (hex.size() != 6) hex = '000000'
    float r = Integer.parseInt(hex.substring(0, 2), 16) / 255
    float g = Integer.parseInt(hex.substring(2, 4), 16) / 255
    float b = Integer.parseInt(hex.substring(4, 6), 16) / 255
    float min = Math.min(Math.min(r, g), b);
    float max = Math.max(Math.max(r, g), b)
    float h = (max + min) / 2.0;
    float s = h
    float l = s
    if(max == min){
        h = s = 0; // achromatic
    }else{
        float d = max - min;
        s = (l > 0.5) ? d / (2 - max - min) : d / (max + min);
        switch(max){
            case r: h = (g - b) / d + (g < b ? 6 : 0); break;
            case g: h = (b - r) / d + 2; break;
            case b: h = (r - g) / d + 4; break;
        }
        h = h / 6;
    }
    return [
        hue: (int) Math.round(100 * h),
        saturation: (int) Math.round(100 * s),
        level: (int) Math.round(100 * l),
        hex: '#' + hex
    ];
};

/******************************************************************************/
/*** DEBUG FUNCTIONS														***/
/******************************************************************************/
private log(message, rtData = null, shift = null, err = null, cmd = null, force = false) {
    if (cmd == "timer") {
    	return [m: message, t: now(), s: shift, e: err]
    }
    if (message instanceof Map) {
    	shift = message.s
        err = message.e
        message = message.m + " (${now() - message.t}ms)"
    }
	if (!force && rtData && rtData.logging && !rtData.logging[cmd] && (cmd != "error")) {
		return
	}
	cmd = cmd ? cmd : "debug"
	//mode is
	// 0 - initialize level, level set to 1
	// 1 - start of routine, level up
	// -1 - end of routine, level down
	// anything else - nothing happens
	def maxLevel = 4
	def level = state.debugLevel ? state.debugLevel : 0
	def levelDelta = 0
	def prefix = "║"
    def prefix2 = "║"
	def pad = "" //"░"
	switch (shift) {
		case 0:
			level = 0
		case 1:
			level += 1
			prefix = "╚"
			prefix2 = "╔"
			pad = "═"
			break
		case -1:
        	level -= 1
			//levelDelta = -(level > 0 ? 1 : 0)
			pad = "═"
			prefix = "╔"
			prefix2 = "╚"           
		break
	}

	if (level > 0) {
		prefix = prefix.padLeft(level + (shift == -1 ? 1 : 0), "║")
		prefix2 = prefix2.padLeft(level + (shift == -1 ? 1 : 0), "║")
    }

	//level += levelDelta
	state.debugLevel = level

	if (rtData && (rtData instanceof Map) && (rtData.logs instanceof List)) {
    	message = "$message".toString().replaceAll(/(\r\n|\r|\n|\\r\\n|\\r|\\n)+/, "\r");
    	List msgs = !err ? message.tokenize("\r") : [message]
        for(msg in msgs) {
    		rtData.logs.push([o: now() - rtData.timestamp, p: prefix2, m: msg + (!!err ? " $err" : ""), c: cmd])
        }
    }
	log."$cmd" "$prefix $message", err
}
private info(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'info' }
private trace(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'trace' }
private debug(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'debug' }
private warn(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'warn' }
private error(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'error' }
private timer(message, rtData = null, shift = null, err = null) { log message, rtData, shift, err, 'timer' }

private tracePoint(rtData, objectId, duration, value) {
	if (objectId && rtData && rtData.trace) {
    	rtData.trace.points[objectId] = [o: now() - rtData.trace.t - duration, d: duration, v: value]
    } else {
    	error "Invalid object ID $objectID for trace point...", rtData
    }
}


private static Map weekDays() {
	return [
    	0: "Sunday",
        1: "Monday",
        2: "Tuesday",
        3: "Wednesday",
        4: "Thursday",
        5: "Friday",
        6: "Saturday"
    ]
}

private static Map yearMonths() {
	return [
    	1: "January",
        2: "February",
        3: "March",
        4: "April",
        5: "May",
        6: "June",
        7: "July",
        8: "August",
        9: "September",
        10: "October",
        11: "November",
        12: "December"
    ]
}

private initSunriseAndSunset(rtData) {
    def rightNow = localTime()
    def sunTimes = app.getSunriseAndSunset()
    rtData.sunrise = localToUtcTime(rightNow - rightNow.mod(86400000) + utcToLocalTime(sunTimes.sunrise.time).mod(86400000))
    rtData.sunset = localToUtcTime(rightNow - rightNow.mod(86400000) + utcToLocalTime(sunTimes.sunset.time).mod(86400000))
}

private getSunriseTime(rtData) {
	if (!rtData.sunrise) initSunriseAndSunset(rtData)
	return rtData.sunrise
}

private getSunsetTime(rtData) {
	if (!rtData.sunset) initSunriseAndSunset(rtData)
	return rtData.sunset
}

private getNextSunriseTime(rtData) {
	if (!(rtData.sunrise instanceof Date)) initSunriseAndSunset(rtData)
	return rtData.sunrise + (rtData.sunrise < now() ? 86400000 : 0)
}

private getNextSunsetTime(rtData) {
	if (!(rtData.sunset instanceof Date)) initSunriseAndSunset(rtData)
	return rtData.sunset + (rtData.sunset < now() ? 86400000 : 0)
}

private getMidnightTime(rtData) {
	def rightNow = localTime()
    return localToUtcTime(rightNow - rightNow.mod(86400000))
}

private getNextMidnightTime(rtData) {
	def rightNow = localTime()
    return localToUtcTime(rightNow - rightNow.mod(86400000) + 86400000)
}

private getNoonTime(rtData) {
	def rightNow = localTime()
    return localToUtcTime(rightNow - rightNow.mod(86400000) + 43200000)
}

private getNextNoonTime(rtData) {
	def rightNow = localTime()
    return localToUtcTime(rightNow - rightNow.mod(86400000) + 43200000 + (rightNow.mod(86400000) >= 43200000 ? 86400000 : 0))
}










private Map getLocalVariables(rtData, vars) {
	Map result = [:]
    def values = atomicState.vars
	for (var in vars) {
    	def variable = [t: var.t, v: var.v ?: cast(rtData, values[var.n], var.t), f: !!var.v] //f means fixed value - we won't save this to the state
        if (rtData && var.v && (var.a == 's')) {
        	variable.v = evaluateExpression(rtData, evaluateOperand(rtData, null, var.v), var.t).v
        }
        result[var.n] = variable
    }
    return result    
}

def Map getSystemVariablesAndValues(rtData) {
	rtData = rtData ?: [:]
	Map result = getSystemVariables()
    for(variable in result) {
    	if (variable.value.d) variable.value.v = getSystemVariableValue(rtData, variable.key)
    }
    return result
}

private static Map getSystemVariables() {
	return [
        "\$args": [t: "dynamic", d: true],
		"\$currentEventAttribute": [t: "string", v: null],
		"\$currentEventDate": [t: "datetime", v: null],
		"\$currentEventDelay": [t: "integer", v: null],
		"\$currentEventDevice": [t: "device", v: null],
		"\$currentEventDeviceIndex": [t: "integer", v: null],
		"\$currentEventDevicePhysical": [t: "boolean", v: null],
		"\$currentEventReceived": [t: "datetime", v: null],
		"\$currentEventValue": [t: "dynamic", v: null],
		"\$currentEventUnit": [t: "string", v: null],
		"\$currentState": [t: "string", v: null],
		"\$currentStateDuration": [t: "string", v: null],
		"\$currentStateSince": [t: "datetime", v: null],
		"\$nextScheduledTime": [t: "datetime", v: null],
		"\$name": [t: "string", d: true],
		"\$state": [t: "string", v: ''],
		"\$now": [t: "datetime", d: true],
        '$device': [t: 'device', v: null],
        '$devices': [t: 'device', v: null],
        '$location': [t: 'device', v: null],
		"\$utc": [t: "datetime", d: true],
		"\$localNow": [t: "datetime", d: true],
		"\$hour": [t: "integer", d: true],
		"\$hour24": [t: "integer", d: true],
		"\$minute": [t: "integer", d: true],
		"\$second": [t: "integer", d: true],
		"\$meridian": [t: "string", d: true],
		"\$meridianWithDots":  [t: "string", d: true],
		"\$day": [t: "integer", d: true],
		"\$dayOfWeek": [t: "integer", d: true],
		"\$dayOfWeekName": [t: "string", d: true],
		"\$month": [t: "integer", d: true],
		"\$monthName": [t: "string", d: true],
		"\$year": [t: "integer", d: true],
		"\$midnight": [t: "datetime", d: true],
		"\$noon": [t: "datetime", d: true],
		"\$sunrise": [t: "datetime", d: true],
		"\$sunset": [t: "datetime", d: true],
		"\$nextMidnight": [t: "datetime", d: true],
		"\$nextNoon": [t: "datetime", d: true],
		"\$nextSunrise": [t: "datetime", d: true],
		"\$nextSunset": [t: "datetime", d: true],
		"\$time": [t: "string", d: true],
		"\$time24": [t: "string", d: true],
		"\$index": [t: "decimal", v: null],
		"\$previousEventAttribute": [t: "string", v: null],
		"\$previousEventDate": [t: "datetime", v: null],
		"\$previousEventDelay": [t: "integer", v: null],
		"\$previousEventDevice": [t: "device", v: null],
		"\$previousEventDeviceIndex": [t: "integer", v: null],
		"\$previousEventDevicePhysical": [t: "boolean", v: null],
		"\$previousEventExecutionTime": [t: "integer", v: null],
		"\$previousEventReceived": [t: "datetime", v: null],
		"\$previousEventValue": [t: "dynamic", v: null],
		"\$previousEventUnit": [t: "string", v: null],
		"\$previousState": [t: "string", v: null],
		"\$previousStateDuration": [t: "string", v: null],
		"\$previousStateSince": [t: "datetime", v: null],
		"\$random": [t: "decimal", d: true],
		"\$randomColor": [t: "string", d: true],
		"\$randomColorName": [t: "string", d: true],
		"\$randomLevel": [t: "integer", d: true],
		"\$randomSaturation": [t: "integer", d: true],
		"\$randomHue": [t: "integer", d: true],
		"\$httpStatusCode": [t: "integer", v: null],
		"\$httpStatusOk": [t: "boolean", v: null],
		"\$iftttStatusCode": [t: "integer", v: null], 
		"\$iftttStatusOk": [t: "boolean", v: null],
		"\$locationMode": [t: "string", d: true],
		"\$shmStatus": [t: "string", d: true]
	].sort{it.key}
}

private getSystemVariableValue(rtData, name) {
	switch (name) {
    	case '$args': return "${rtData.args}".toString()
		case "\$name": return app.label
		case "\$now": return (long) now()
		case "\$utc": return (long) now()
		case "\$localNow": return (long) localTime()
		case "\$hour": def h = localDate().hours; return (h == 0 ? 12 : (h > 12 ? h - 12 : h)) 
		case "\$hour24": return localDate().hours
		case "\$minute": return localDate().minutes 
		case "\$second": return localDate().seconds 
		case "\$meridian": def h = localDate().hours; return ( h < 12 ? "AM" : "PM") 
		case "\$meridianWithDots": def h = localDate().hours; return ( h < 12 ? "A.M." : "P.M.") 
		case "\$day": return localDate().date 
		case "\$dayOfWeek": return localDate().day 
		case "\$dayOfWeekName": return weekDays()[localDate().day] 
		case "\$month": return localDate().month + 1 
		case "\$monthName": return yearMonths()[localDate().month + 1] 
		case "\$year": return localDate().year + 1900 
		case "\$midnight": return getMidnightTime(rtData)
		case "\$noon": return getNoonTime(rtData)
		case "\$sunrise": return getSunriseTime(rtData); 
		case "\$sunset": return getSunsetTime(rtData);
		case "\$nextMidnight":  return getNextMidnightTime(rtData);
		case "\$nextNoon": return getNextNoonTime(rtData);
		case "\$nextSunrise": return getNextSunriseTime(rtData);
		case "\$nextSunset": return getNextSunsetTime(rtData);
		case "\$time": def t = localDate(); def h = t.hours; def m = t.minutes; return (h == 0 ? 12 : (h > 12 ? h - 12 : h)) + ":" + (m < 10 ? "0$m" : "$m") + " " + (h <12 ? "A.M." : "P.M.") 
		case "\$time24": def t = localDate(); def h = t.hours; def m = t.minutes; return h + ":" + (m < 10 ? "0$m" : "$m") 
		case "\$random": def result = getRandomValue("\$random") ?: (float)Math.random(); setRandomValue("\$random", result); return result 
		case "\$randomColor": def result = getRandomValue("\$randomColor") ?: colorUtil.RANDOM.rgb; setRandomValue("\$randomColor", result); return result 
		case "\$randomColorName": def result = getRandomValue("\$randomColorName") ?: colorUtil.RANDOM.name; setRandomValue("\$randomColorName", result); return result 
		case "\$randomLevel": def result = getRandomValue("\$randomLevel") ?: (int)Math.round(100 * Math.random()); setRandomValue("\$randomLevel", result); return result 
		case "\$randomSaturation": def result = getRandomValue("\$randomSaturation") ?: (int)Math.round(50 + 50 * Math.random()); setRandomValue("\$randomSaturation", result); return result 
		case "\$randomHue": def result = getRandomValue("\$randomHue") ?: (int)Math.round(360 * Math.random()); setRandomValue("\$randomHue", result); return result 
  		case "\$locationMode": return location.getMode()
		case "\$shmStatus": switch (location.currentState("alarmSystemStatus")?.value) { case 'off': return 'Disarmed'; case 'stay': return 'Armed/Stay'; case 'away': return 'Armed/Away'; }; return null;
    }
}

private setSystemVariableValue(rtData, name, value) {
	if (!name || !(name.startsWith('$'))) return
    def var = rtData.systemVars[name]
    if (!var || var.d) return
   	rtData.systemVars[name].v = value
}

private getRandomValue(name) {
	state.temp = state.temp ?: [:]
	state.temp.randoms = state.temp.randoms ?: [:]
	return state.temp?.randoms[name]
}

private void setRandomValue(name, value) {
	state.temp = state.temp ?: [:]
	state.temp.randoms = state.temp.randoms ?: [:]
	state.temp.randoms[name] = value
}

private void resetRandomValues() {
	state.temp = state.temp ?: [:]
	state.temp.randoms = [:]
}