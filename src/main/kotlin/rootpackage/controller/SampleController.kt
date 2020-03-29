package rootpackage.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SampleController() {

    @GetMapping("/")
    fun getHellow(): String {
        return "Hellow World."
    }

}