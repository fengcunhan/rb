// Copyright (c) 2017, the R8 project authors. Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.
package minification;

public class SubClassC extends SuperClassC implements InterfaceC {

  @Override
  public int functionFromIntToInt(int arg) {
    System.out.println("SubClassC:functionFromIntToInt");
    return arg;
  }

  @Override
  public int uniqueLittleMethodInB() {
    System.out.println("SubClassC:uniqueLittleMethodInB");
    return 0;
  }

  @Override
  public int uniqueLittleMethodInC() {
    System.out.println("SubClassC:uniqueLittleMethodInC");
    return 0;
  }
}
