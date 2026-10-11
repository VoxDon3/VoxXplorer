.class Lax/a3/A$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/A;->g3()Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/a3/A;


# direct methods
.method constructor <init>(Lax/a3/A;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/A$a;->a:Lax/a3/A;

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
.method public onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    .line 1
    iget-object p1, p0, Lax/a3/A$a;->a:Lax/a3/A;

    .line 2
    .line 3
    invoke-static {p1}, Lax/a3/A;->i3(Lax/a3/A;)Lax/a3/A$g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_11

    .line 8
    .line 9
    iget-object p1, p0, Lax/a3/A$a;->a:Lax/a3/A;

    .line 10
    .line 11
    invoke-static {p1}, Lax/a3/A;->i3(Lax/a3/A;)Lax/a3/A$g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lax/a3/A$g;->a()V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
