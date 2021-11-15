package com.timeroar.blog.framework.design.lsp;

/**
 * <p>Tadpole</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/15 20:08
 */
public class Tadpole extends Frog{

    public static int getArea(Tadpole tadpole) {
        if (tadpole.getLeg() > 0) {
            return 0;
        }
        return 0;
    }

}
