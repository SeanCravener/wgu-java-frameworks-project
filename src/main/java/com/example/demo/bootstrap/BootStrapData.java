package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        if (partRepository.count() == 0 && productRepository.count() == 0) {

            Product StandardShortboard = new Product("Standard Shortboard", 49.95, 15);
            Product SurfskateShortboard = new Product("Surfskate Shortboard", 59.95, 5);
            Product OldSchoolShortboard = new Product("Old School Shortboard", 44.95, 10);
            Product TwinTipLongboard = new Product("Twin Tip Longboard", 79.95, 8);
            Product PintailLongboard = new Product("Pintail Longboard", 69.95, 8);

            productRepository.save(StandardShortboard);
            productRepository.save(SurfskateShortboard);
            productRepository.save(OldSchoolShortboard);
            productRepository.save(TwinTipLongboard);
            productRepository.save(PintailLongboard);

            OutsourcedPart Trucks = new OutsourcedPart();
            Trucks.setCompanyName("Tensor");
            Trucks.setName("Trucks");
            Trucks.setInv(10);
            Trucks.setPrice(38.99);
            Trucks.setId(110L);

            OutsourcedPart Wheels = new OutsourcedPart();
            Wheels.setCompanyName("Ace");
            Wheels.setName("Wheels");
            Wheels.setInv(16);
            Wheels.setPrice(25.99);
            Wheels.setId(120L);

            OutsourcedPart Bearings = new OutsourcedPart();
            Bearings.setCompanyName("Venture");
            Bearings.setName("Bearings");
            Bearings.setInv(29);
            Bearings.setPrice(27.99);
            Bearings.setId(130L);

            OutsourcedPart Griptape = new OutsourcedPart();
            Griptape.setCompanyName("Krux");
            Griptape.setName("Griptape");
            Griptape.setInv(12);
            Griptape.setPrice(11.99);
            Griptape.setId(140);

            OutsourcedPart Risers = new OutsourcedPart();
            Risers.setCompanyName("Dook");
            Risers.setName("Riser Pads");
            Risers.setInv(24);
            Risers.setPrice(3.49);
            Risers.setId(150L);

            outsourcedPartRepository.save(Trucks);
            outsourcedPartRepository.save(Wheels);
            outsourcedPartRepository.save(Bearings);
            outsourcedPartRepository.save(Griptape);
            outsourcedPartRepository.save(Risers);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
