public class StagesOfLife {

        public String determineStagesOfLife (int ageNumber){

            if (ageNumber < 0) {
                throw new IllegalArgumentException("Number cannot be below one month");
            }
            else if (ageNumber < 1) {
                return "Infant";
            }
            else if (ageNumber < 4){
                return "Toddler";
            }
            else if (ageNumber < 12){
                return "Child";
            }
            else if (ageNumber < 19){
                return "Teen";
            }
            else if (ageNumber < 39) {
                return "Adult";
            }
            else if (ageNumber < 59) {
                return "Middle Age Adult";
            }
            else {
                return "Senior Adult";
            }
        }
    }

