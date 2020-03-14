package ru.telda.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.telda.mapper.RegionMapper;
import ru.telda.model.RegionModel;

import java.util.List;

@RestController
public class RegionController {
    private RegionMapper mapper;

    public RegionController(RegionMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/getAll")
    private List<RegionModel> getAll(){
        return mapper.findAll();
    }

    @RequestMapping("/create")
    private String create(@RequestParam int id,@RequestParam String name,@RequestParam String shortName){
        RegionModel regionModel = new RegionModel(id,name, shortName);
        mapper.insert(regionModel);
        return regionModel.toString();
    }
    @RequestMapping("/get")
    private RegionModel getFinId(@RequestParam int id){
        return mapper.getById(id);
    }

    @RequestMapping("/update")
    private String update(@RequestParam int id, @RequestParam String name, @RequestParam String shortName){
        mapper.update(id,name,shortName);

        return mapper.getById(id).toString();
    }

    @RequestMapping("/deleteAll")
    private void deleteAll(){
        mapper.deleteAll();
    }

    @RequestMapping("/delete")
    private List<RegionModel> deleteById(@RequestParam int id){
        mapper.deleteById(id);

        return mapper.findAll();
    }
}
