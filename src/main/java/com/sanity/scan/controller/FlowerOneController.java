package com.sanity.scan.controller;

import com.sanity.scan.utils.Utill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/One")
public class FlowerOneController {


    @RequestMapping(value = "/Rose", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getRoseSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lily", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLilySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Tulip", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getTulipSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Daisy", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getDaisySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Jasmine", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getJasmineSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Orchid", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getOrchidSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Iris", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getIrisSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Carnation", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getCarnationSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Chrysanthemum", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getChrysanthemumSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Daffodil", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getDaffodilSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Hibiscus", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getHibiscusSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lavender", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLavenderSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Marigold", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMarigoldSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Pansy", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPansySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Peony", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPeonySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Petunia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPetuniaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Poinsettia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPoinsettiaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Sunflower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getSunflowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Violet", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getVioletSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Anemone", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getAnemoneSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Aster", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getAsterSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Bellflower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getBellflowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/BlackEyedSusan", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getBlackEyedSusanSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Bluebell", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getBluebellSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Buttercup", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getButtercupSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Calendula", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getCalendulaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Crocus", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getCrocusSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Dandelion", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getDandelionSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Freesia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getFreesiaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Gardenia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getGardeniaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Gladiolus", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getGladiolusSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Heather", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getHeatherSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Hydrangea", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getHydrangeaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Larkspur", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLarkspurSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lilac", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLilacSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Magnolia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMagnoliaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Narcissus", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getNarcissusSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Nasturtium", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getNasturtiumSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Poppy", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPoppySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Ranunculus", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getRanunculusSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Redbud", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getRedbudSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Snapdragon", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getSnapdragonSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Stephanotis", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getStephanotisSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/SweetPea", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getSweetPeaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Zinnia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getZinniaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Begonia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getBegoniaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Columbine", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getColumbineSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Cosmo", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getCosmoSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Dahlia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getDahliaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/ForgetMeNot", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getForgetMeNotSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Foxglove", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getFoxgloveSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Hollyhock", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getHollyhockSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Impatiens", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getImpatiensSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lupine", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLupineSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Mallow", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMallowSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/MorningGlory", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMorningGlorySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/PassionFlower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPassionFlowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Phlox", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPhloxSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/QueenAnnesLace", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getQueenAnnesLaceSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Rhododendron", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getRhododendronSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/ShastaDaisy", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getShastaDaisySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Stock", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getStockSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Thistle", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getThistleSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/TrumpetVine", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getTrumpetVineSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Verbena", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getVerbenaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Wisteria", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getWisteriaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Yarrow", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getYarrowSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/YellowBells", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getYellowBellsSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Alstroemeria", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getAlstroemeriaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Aquilegia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getAquilegiaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Azalea", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getAzaleaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/BlanketFlower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getBlanketFlowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Coneflower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getConeflowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Delphinium", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getDelphiniumSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Echinacea", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getEchinaceaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Fern", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getFernSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Firecracker", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getFirecrackerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/GlobeThistle", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getGlobeThistleSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Goldenrod", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getGoldenrodSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Honeysuckle", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getHoneysuckleSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Ivy", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getIvySmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/KangarooPaw", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getKangarooPawSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lantana", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLantanaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lobelia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLobeliaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Monarda", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMonardaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Nasturtium2", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getNasturtium2Smell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/NewGuineaImpatiens", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getNewGuineaImpatiensSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/PincushionFlower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getPincushionFlowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Salvia", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getSalviaSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Statice", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getStaticeSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/SweetWilliam", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getSweetWilliamSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Wallflower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getWallflowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Windflower", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getWindflowerSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/YellowTrumpetVine", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getYellowTrumpetVineSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Lior", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getLiorSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Eyal", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getEyalSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Ofer", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getOferSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Eliyahu", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getEliyahuSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Idan", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getIdanSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }

    @RequestMapping(value = "/Moris", method = {RequestMethod.GET, RequestMethod.POST,
                                    RequestMethod.DELETE, RequestMethod.HEAD, RequestMethod.OPTIONS,
                                    RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.TRACE})
    public void getMorisSmell(@RequestParam(required=true) String password) throws IOException {
        Utill.hundredRisks(password);
    }
}
