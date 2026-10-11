.class Lax/a3/v$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/v;->T2(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/a3/v;


# direct methods
.method constructor <init>(Lax/a3/v;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/v$n;->a:Lax/a3/v;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 4

    .line 1
    iget-object p1, p0, Lax/a3/v$n;->a:Lax/a3/v;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lax/a3/v;->v3(Lax/a3/v;Z)Z

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/a3/v$n;->a:Lax/a3/v;

    .line 7
    .line 8
    invoke-static {p1}, Lax/a3/v;->w3(Lax/a3/v;)Landroid/widget/EditText;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    xor-int/lit8 v0, p2, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lax/a3/v$n;->a:Lax/a3/v;

    .line 18
    .line 19
    invoke-static {p1}, Lax/a3/v;->x3(Lax/a3/v;)Landroid/widget/EditText;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    xor-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
