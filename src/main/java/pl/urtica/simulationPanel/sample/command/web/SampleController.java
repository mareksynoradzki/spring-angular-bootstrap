package pl.urtica.simulationPanel.sample.command.web;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.urtica.simulationPanel.sample.command.api.ChangeNameCmd;

@RestController
//@Api(value = "Sample", description = "Obsługuje operacje na przykladach")
public class SampleController {

//    @ApiOperation(value = "Zmien nazwę przetargu")
    @PostMapping(value = "/sample/changeName")
    public ResponseEntity changeName(@RequestBody ChangeNameCmd changeNameCmd) {
        return new ResponseEntity("Sample has changed", HttpStatus.OK);
    }
}
