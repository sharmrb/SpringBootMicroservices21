package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** Handle the /start endpoints
 * @return
 *
 */

@Controller
public class PlantPLacesController {

	@RequestMapping("/start")
		public String start() {
			return "start";
		}
	/**Handle the / endpoint
	 * @return
	 */

		
		@RequestMapping("/")
			public String index() {
				return "start";
			}
	}

