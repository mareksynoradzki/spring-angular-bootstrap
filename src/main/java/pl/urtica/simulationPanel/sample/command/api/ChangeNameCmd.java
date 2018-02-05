package pl.urtica.simulationPanel.sample.command.api;

//import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChangeNameCmd implements Serializable {

//    @ApiModelProperty(notes = "Id przetargu", allowEmptyValue = false)
    private String id;

//    @ApiModelProperty(notes = "Nowa nazwa przetargu")
    private String name;
}
