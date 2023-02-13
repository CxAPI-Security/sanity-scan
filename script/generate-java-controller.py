# this script generate 10 java controller
# files with 100 api functions
# that call to utils function with 100 risks
# in each controller

flowers = ["Rose", "Lily", "Tulip", "Daisy", "Jasmine", "Orchid", "Iris", "Carnation", "Chrysanthemum", "Daffodil",
           "Hibiscus", "Lavender", "Marigold", "Pansy", "Peony", "Petunia", "Poinsettia", "Sunflower", "Violet",
           "Anemone", "Aster", "Bellflower", "Black Eyed Susan", "Bluebell", "Buttercup", "Calendula", "Crocus",
           "Dandelion", "Freesia", "Gardenia", "Gladiolus", "Heather", "Hydrangea", "Larkspur", "Lilac", "Magnolia",
           "Narcissus", "Nasturtium", "Poppy", "Ranunculus", "Redbud", "Snapdragon", "Stephanotis", "Sweet Pea",
           "Zinnia", "Begonia", "Columbine", "Cosmo", "Dahlia", "Forget Me Not", "Foxglove", "Hollyhock", "Impatiens",
           "Lupine", "Mallow", "Morning Glory", "Passion Flower", "Phlox", "Queen Annes Lace", "Rhododendron",
           "Shasta Daisy", "Stock", "Thistle", "Trumpet Vine", "Verbena", "Wisteria", "Yarrow", "Yellow Bells",
           "Alstroemeria", "Aquilegia", "Azalea", "Blanket Flower", "Coneflower", "Delphinium", "Echinacea",
           "Fern", "Firecracker", "Globe Thistle", "Goldenrod", "Honeysuckle", "Ivy", "Kangaroo Paw", "Lantana",
           "Lobelia", "Monarda", "Nasturtium2", "New Guinea Impatiens", "Pincushion Flower", "Salvia", "Statice",
           "Sweet William", "Wallflower", "Windflower", "Yellow Trumpet Vine", "Lior", "Eyal", "Ofer", "Eliyahu",
           "Idan", "Moris"]


def generate_java_functions(flowers):
    number_words = ["one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"]
    class_template = """
    package com.sanity.scan.controller;
    
    import com.sanity.scan.utils.Utill;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;
    
    import java.io.IOException;
    
    @RestController
    @RequestMapping("/{number}")
    public class Flower{number}Controller {{
    
    {methods}
    }}
    """

    method_template = """
        @RequestMapping(value = "/{flower}", method = {{RequestMethod.GET, RequestMethod.POST, 
                                        RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS, 
                                        RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE}})
        public void get{flower_capital}Smell(@RequestParam(required=true) String password) throws IOException {{
            Utill.hundredRisks(password);
        }}
    """
    for number in number_words:
        methods = ""
        for flower in flowers:
            flower = flower.replace(" ", "")
            flower_capital = flower
            methods += method_template.format(flower=flower, flower_capital=flower_capital)

        final_class = class_template.format(methods=methods, number=number.capitalize())

        with open("Flower{number}Controller.java".format(number=number.capitalize()), "w") as f:
            f.write(final_class)


if __name__ == "__main__":
    generate_java_functions(flowers)
