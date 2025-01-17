![EL Regionaalarengu Fond](doc/img/EL_Regionaalarengu_Fond_horisontaalne.jpg)

Andmejälgija / Data Tracker
=====================

### Andmejälgija üldine kirjeldus

Andmejälgija on inimesele suunatud teenus eesti.ee-s, mille eesmärgiks on tagada isikuandmete töötluse läbipaistvus avalikus sektoris. Andmejälgija toetub iga andmekogu võimekusele enda sees toimuvat andmetöötlust logide kujul talletada, et seda hiljem inimesele ehk andmesubjektile eesti.ee-s oleva teenuse kaudu kuvada. 

Arhitektuurselt on tegemist täielikult hajusa süsteemiga, st inimesele kuvatav info pärineb otse Andmejälgija teenuse realiseerinud andmekogust. Eesti.ee teeb kasutaja soovil päringu igasse Andmejälgija teenusesse ning kuvab päringuvastuse ilma salvestamata välja.

![AJ_3](img/aj_model.PNG)
### Andmejälgijas kajastuv info

Andmejälgija peab inimesele kuvama infot nii andmekogus lokaalselt toimuvast andmetöötlusest (ametnike-töötajate tegevused isikuandmetega) kui ka ülevaadet sellest, kui andmeid on edastatud mõnele kolmandale osapoolele (üle X-tee teisele riigiasutusele, ettevõttele jm). 

Soovituslik on Andmejälgija funktsionaalsuse peale mõelda juba infosüsteemi projekteerides, arvestades vajadusega süsteemis toimuv andmetöötlus tulevikus inimeste jaoks läbipaistvaks ja arusaadavaks muuta. 

### Andmejälgija teenus ja protokoll

Andmejälgija teenuse ehitamiseks on 2 meetodit

**1. Soovitatav: Realiseerida Andmejälgija kasutusteabe esitamise protokollile vastav X-tee teenus iseseisvalt**

   RIA vaatest on oluline, et kõik Andmejälgijat rakendavad andmekogud teeks seda samadel alustel, st rakendaks enda teenuse realiseerimisel Andmejälgija protokolli. Lihtsalt öeldes peab olema Andmejälgija teenus ehitatud RIA poolt pakutud spetsifikatsiooni põhjal, et oleks võimalik erinevate andmekogude Andmejälgija teenused eesti.ee portaalis sarnaselt kuvada.

   Kuna andmekogud ja neid teenindavad infosüsteemid on väga erinevad, on praktikas reeglina mõistlik realiseerida Andmejälgija teenus iseseisvalt, vastavalt konkreetse süsteemi iseloomule ja nõuetele. Tihti on mõistlik aluseks võtta igas infosüsteemis olev logilahendus, mis talletab kõik isikuandmetega toimunud sündmused.

   X-teel avatava [teenuse findUsage spetsifikatsioon](https://github.com/e-gov/AJ/blob/master/doc/spetsifikatsioonid/Kasutusteabe_esitamise_protokoll.md)
   * Kasutusteabe esitamise protokoll (SOAP) - andmesalvesti rollis on mis tahes vastavaid andmeid sisaldav rätseplahendus
   * Lisatud OpenAPI kirjeldus REST teenuse loomiseks - eesti.ee päringutugi tuleb 2021 II+ kvartal

2. Kasutada RIA poolt loodud näidislahendus (AS-IS põhimõttel)

   RIA poolt 2016. aastal loodud näidislahendus on võimelised eristama andmekogust väljuvaid X-tee päringute vastuseid, mis sisaldavad inimese isikukoodi, kattes ära osa Andmejälgija teenuse jaoks vajalikust funktsionaalsusest. Siiski tuleb seda vaadelda kui ainult osa ühes andmekogus toimuvast andmetöötlusest. Andmekogude puhul, kus andmevahetus üle X-tee on minimaalne, kuid isikuandmeid töödeldakse lokaalselt, jätaks ainult näidislahenduse kasutamine andmesubjektile väära mulje vähesest andmetöötlusest.

   Kuna lokaalne andmetöötlus ning üle X-tee toimuv andmetöötlus on tihti praktikas läbipõimunud ning kõigi logide põhjal Andmejälgija funktsionaalsuse loomine hõlmab endas ka X-tee päringuid, ei ole näidislahenduse parim viis andmejälgijas rakendada. Sellepärast pakub RIA hetkel neid komponente AS-IS põhimõttel ning aktiivselt arendusse vahendeid ei suuna.

Näidiskomponentide dokumentatsioon https://github.com/e-gov/AJ/blob/master/doc/README.md

### Kontakt ja täpsem info

Kõigi küsimuste puhul palume võtta ühendust Andmejälgija tootejuhiga Riigi Infosüsteemi Ametis:
Piret Pärna piret.parna@ria.ee
