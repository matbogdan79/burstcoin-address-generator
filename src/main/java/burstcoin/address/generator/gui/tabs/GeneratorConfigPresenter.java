/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 by luxe - https://github.com/de-luxe - BURST-LUXE-ZDVD-CX3E-3SM58
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package burstcoin.address.generator.gui.tabs;

import burstcoin.address.generator.GeneratorConfig;
import javafx.scene.Node;

/**
 * The type Generator config presenter.
 */
public class GeneratorConfigPresenter
{
  private GeneratorConfigView view;

  /**
   * Instantiates a new Generator config presenter.
   *
   * @param config the config
   * @param callback the callback
   */
  public GeneratorConfigPresenter(GeneratorConfig config, GeneratorConfigView.Callback callback)
  {
    this.view = new GeneratorConfigView(config, callback);
  }

  /**
   * Gets node.
   *
   * @return the node
   */
  public Node getNode()
  {
    return view;
  }
}
