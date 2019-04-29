package zkgrails4

import org.springframework.web.servlet.ModelAndView

class DemoController {

    def index() {
        new ModelAndView('demo')
    }
}
