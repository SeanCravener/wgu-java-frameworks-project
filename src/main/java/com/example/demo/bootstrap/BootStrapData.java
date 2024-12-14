package com.example.demo.bootstrap;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;

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

        if (productRepository.count() == 0) {

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
        }

        if (partRepository.count() == 0) {
            InhousePart Bushings = new InhousePart();
            Bushings.setName("Bushings");
            Bushings.setInv(25);
            Bushings.setPrice(4.99);
            Bushings.setId(210L);

            InhousePart DeckRails = new InhousePart();
            DeckRails.setName("Deck Rails");
            DeckRails.setInv(20);
            DeckRails.setPrice(11.99);
            DeckRails.setId(220L);

            InhousePart TailBone = new InhousePart();
            TailBone.setName("Tail Bone");
            TailBone.setInv(30);
            TailBone.setPrice(10.99);
            TailBone.setId(230L);

            InhousePart AxleNuts = new InhousePart();
            AxleNuts.setName("Axle Nuts");
            AxleNuts.setInv(52);
            AxleNuts.setPrice(1.99);
            AxleNuts.setId(240L);

            InhousePart Baseplate = new InhousePart();
            Baseplate.setName("Baseplate");
            Baseplate.setInv(11);
            Baseplate.setPrice(29.00);
            Baseplate.setId(250L);

            Bushings.setMinInv(2);
            Bushings.setMaxInv(100);
            DeckRails.setMinInv(4);
            DeckRails.setMaxInv(100);
            TailBone.setMinInv(4);
            TailBone.setMaxInv(100);
            AxleNuts.setMinInv(1);
            AxleNuts.setMaxInv(100);
            Baseplate.setMinInv(2);
            Baseplate.setMaxInv(100);

            partRepository.save(Bushings);
            partRepository.save(DeckRails);
            partRepository.save(TailBone);
            partRepository.save(AxleNuts);
            partRepository.save(Baseplate);
        }

        if (outsourcedPartRepository.count() == 0) {
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
            Griptape.setId(140L);

            OutsourcedPart Risers = new OutsourcedPart();
            Risers.setCompanyName("Dook");
            Risers.setName("Riser Pads");
            Risers.setInv(24);
            Risers.setPrice(3.49);
            Risers.setId(150L);

            Trucks.setMinInv(2);
            Trucks.setMaxInv(100);
            Wheels.setMinInv(4);
            Wheels.setMaxInv(100);
            Bearings.setMinInv(4);
            Bearings.setMaxInv(100);
            Griptape.setMinInv(1);
            Griptape.setMaxInv(100);
            Risers.setMinInv(2);
            Risers.setMaxInv(100);

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
