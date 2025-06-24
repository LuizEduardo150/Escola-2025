package ifmg.luiz.atividadeaula.Escola.constants;

public enum ResourceTypeEnum {

    LESSON_ONLY("Lição"),
    LESSON_TASK("Tarefa"),
    FORUM("fórum"),
    EXTERNAL_LINK("link externo");

    private String description;

    private ResourceTypeEnum(String description){
        this.description = description;
    }

}
